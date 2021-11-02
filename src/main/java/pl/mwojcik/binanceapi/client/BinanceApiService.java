package pl.mwojcik.binanceapi.client;

import pl.mwojcik.binanceapi.client.dto.ExchangeInfo;
import pl.mwojcik.binanceapi.client.dto.ServerTime;
import reactor.core.publisher.Mono;

public interface BinanceApiService {

    Mono<Void> ping();

    Mono<ServerTime> getServerTime();

    Mono<Object> getExchangeInfo();
}
