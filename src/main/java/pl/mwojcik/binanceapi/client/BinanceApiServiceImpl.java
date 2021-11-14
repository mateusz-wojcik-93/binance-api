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
import pl.mwojcik.binanceapi.client.market.OrderBook;
import pl.mwojcik.binanceapi.configuration.properties.BinanceProperties;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class BinanceApiServiceImpl implements BinanceApiService {

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
        params.put("symbol", Collections.singletonList(symbol));
        params.put("limit", Collections.singletonList(String.valueOf(limit)));
        URI url = UriComponentsBuilder.fromUri(URI.create(binanceProperties.getOrderBookUrl()))
                                      .queryParams(params)
                                      .build()
                                      .toUri();
        return binanceWebClient.get()
                               .uri(url)
                               .retrieve()
                               .bodyToMono(OrderBook.class);
    }

    @Override
    public Mono<List<TradeHistoryItem>> getTrades(String symbol, Integer limit){
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.put("symbol", Collections.singletonList(symbol));
        params.put("limit", Collections.singletonList(String.valueOf(limit)));
        URI url = UriComponentsBuilder.fromUri(URI.create(binanceProperties.getTradesUrl()))
                                      .queryParams(params)
                                      .build()
                                      .toUri();
        return binanceWebClient.get()
                               .uri(url)
                               .retrieve()
                               .bodyToMono(new ParameterizedTypeReference<List<TradeHistoryItem>>() {});
    }

}
