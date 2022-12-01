package pl.mwojcik.binanceapi.client;

import pl.mwojcik.binanceapi.client.account.TradeHistoryItem;
import pl.mwojcik.binanceapi.client.dto.ExchangeInfo;
import pl.mwojcik.binanceapi.client.dto.ServerTime;
import pl.mwojcik.binanceapi.client.market.AggTrade;
import pl.mwojcik.binanceapi.client.market.OrderBook;
import reactor.core.publisher.Mono;

import java.util.List;

public interface BinanceApiService {

    Mono<Void> ping();

    Mono<ServerTime> getServerTime();

    Mono<ExchangeInfo> getExchangeInfo();

    Mono<OrderBook> getOrderBook(String symbol, Integer limit);

    Mono<List<TradeHistoryItem>> getTrades(String symbol, Integer limit);

    Mono<List<TradeHistoryItem>> getHistoricalTrades(String symbol, Integer limit, Long fromId);

    Mono<List<AggTrade>> getAggTrades(String symbol, String fromId, Integer limit, Long startTime, Long endTime);
}
