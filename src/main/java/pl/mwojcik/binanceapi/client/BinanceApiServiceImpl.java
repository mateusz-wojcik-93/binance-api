package pl.mwojcik.binanceapi.client;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import pl.mwojcik.binanceapi.client.account.TradeHistoryItem;
import pl.mwojcik.binanceapi.client.dto.ExchangeInfo;
import pl.mwojcik.binanceapi.client.dto.ServerTime;
import pl.mwojcik.binanceapi.client.market.AggTrade;
import pl.mwojcik.binanceapi.client.market.OrderBook;
import pl.mwojcik.binanceapi.configuration.properties.BinanceProperties;
import pl.mwojcik.binanceapi.util.HmacSHA256Signer;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import static java.util.Optional.ofNullable;

@Service
@AllArgsConstructor
public class BinanceApiServiceImpl implements BinanceApiService {

    public static final String SYMBOL = "symbol";
    public static final String LIMIT = "limit";
    private WebClient binanceWebClient;
    private BinanceProperties binanceProperties;

    @Override
    public Mono<Void> ping() {
        return binanceWebClient.get()
                               .uri(URI.create(binanceProperties.getPingUrl()))
                               .retrieve()
                               .bodyToMono(Void.class);
    }

    @Override
    public Mono<ServerTime> getServerTime() {
        return binanceWebClient.get()
                               .uri(URI.create(binanceProperties.getServerTimeUrl()))
                               .retrieve()
                               .bodyToMono(ServerTime.class);
    }

    @Override
    public Mono<ExchangeInfo> getExchangeInfo() {
        return binanceWebClient.get()
                               .uri(URI.create(binanceProperties.getExchangeInfoUrl()))
                               .retrieve()
                               .bodyToMono(ExchangeInfo.class);
    }

    @Override
    public Mono<OrderBook> getOrderBook(String symbol, Integer limit) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.put(SYMBOL, Collections.singletonList(symbol));
        params.put(LIMIT, Collections.singletonList(String.valueOf(limit)));
        return binanceWebClient.get()
                               .uri(buildUrl(params, binanceProperties.getOrderBookUrl()))
                               .retrieve()
                               .bodyToMono(OrderBook.class);
    }

    @Override
    public Mono<List<TradeHistoryItem>> getTrades(String symbol, Integer limit) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.put(SYMBOL, Collections.singletonList(symbol));
        params.put(LIMIT, Collections.singletonList(String.valueOf(limit)));
        URI uri = buildUrl(params, binanceProperties.getTradesUrl());
        String signature = generateSignature(uri, "5uPqQXrFE0zcoWw18bGuQFQhKfEp0xZxQHvBdOBLD3uqSPkRVPGQ4U3aTmzp3UQc");
        params.put("signature", Collections.singletonList(signature));
        uri = buildUrl(params, binanceProperties.getTradesUrl());
        return binanceWebClient.get()
                               .uri(uri)
                               .retrieve()
                               .bodyToMono(new ParameterizedTypeReference<List<TradeHistoryItem>>() {});
    }

    @Override
    public Mono<List<TradeHistoryItem>> getHistoricalTrades(String symbol, Integer limit, Long fromId) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.put(SYMBOL, Collections.singletonList(symbol));
        params.put(LIMIT, Collections.singletonList(String.valueOf(limit)));
        params.put("fromId", Collections.singletonList(String.valueOf(fromId)));
        URI uri = buildUrl(params, binanceProperties.getHistoricalTradesUrl());
        return binanceWebClient.get()
                               .uri(uri)
                               .retrieve()
                               .bodyToMono(new ParameterizedTypeReference<List<TradeHistoryItem>>() {});
    }

    @Override
    public Mono<List<AggTrade>> getAggTrades(String symbol, String fromId, Integer limit, Long startTime, Long endTime) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.put(SYMBOL, Collections.singletonList(symbol));

        ofNullable(fromId).ifPresent(aggTradesFromId -> params.put("fromId", Collections.singletonList(aggTradesFromId)));
        ofNullable(limit).ifPresent(aggTradesLimit -> params.put(LIMIT, Collections.singletonList(String.valueOf(aggTradesLimit))));
        ofNullable(startTime).ifPresent(aggTradesStartTime -> params.put("startTime", Collections.singletonList(String.valueOf(aggTradesStartTime))));
        ofNullable(limit).ifPresent(aggTradesEndTime -> params.put("endTime", Collections.singletonList(String.valueOf(aggTradesEndTime))));

        URI uri = buildUrl(params, binanceProperties.getAggTradesUrl());

        return binanceWebClient.get()
                               .uri(uri)
                               .retrieve()
                               .bodyToMono(new ParameterizedTypeReference<List<AggTrade>>() {});
    }

    private static String generateSignature(URI uri, String secretKey) {
        return HmacSHA256Signer.sign(uri.getQuery(), secretKey);
    }

    private static URI buildUrl(MultiValueMap<String, String> params, String historicalTradesUrl) {
        return UriComponentsBuilder.fromUri(URI.create(historicalTradesUrl))
                                   .queryParams(params)
                                   .build()
                                   .toUri();
    }

}
