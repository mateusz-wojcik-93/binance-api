package pl.mwojcik.binanceapi.client;

import pl.mwojcik.binanceapi.client.account.TradeHistoryItem;
import pl.mwojcik.binanceapi.client.dto.ExchangeInfo;
import pl.mwojcik.binanceapi.client.dto.ServerTime;
import pl.mwojcik.binanceapi.client.market.OrderBook;
import reactor.core.publisher.Mono;

import java.util.List;

public interface BinanceApiService {

    Mono<Void> ping();

    Mono<ServerTime> getServerTime();

    Mono<ExchangeInfo> getExchangeInfo();

    Mono<OrderBook> getOrderBook(String symbol, Integer limit);

    Mono<List<TradeHistoryItem>> getTrades(String symbol, Integer limit);

}
