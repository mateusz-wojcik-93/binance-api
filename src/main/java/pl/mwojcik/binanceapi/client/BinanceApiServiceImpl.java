package pl.mwojcik.binanceapi.client;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import pl.mwojcik.binanceapi.client.dto.ExchangeInfo;
import pl.mwojcik.binanceapi.client.dto.ServerTime;
import pl.mwojcik.binanceapi.configuration.properties.BinanceProperties;
import reactor.core.publisher.Mono;

import java.net.URI;

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
    public Mono<Object> getExchangeInfo() {
        return binanceWebClient.get()
                               .uri(URI.create(binanceProperties.getExchangeInfoUrl()))
                               .retrieve()
                               .bodyToMono(Object.class);
    }

}
