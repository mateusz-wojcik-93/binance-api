package pl.mwojcik.binanceapi.internal;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.mwojcik.binanceapi.client.BinanceApiService;
import pl.mwojcik.binanceapi.client.account.TradeHistoryItem;
import pl.mwojcik.binanceapi.client.dto.ExchangeInfo;
import pl.mwojcik.binanceapi.client.dto.ServerTime;
import pl.mwojcik.binanceapi.client.market.AggTrade;
import pl.mwojcik.binanceapi.client.market.OrderBook;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

    BinanceApiService binanceApiService;

    @GetMapping
    public Mono<Void> get() {
        return binanceApiService.ping();
    }

    @GetMapping(value = "/server-time")
    public Mono<ServerTime> getServerTime() {
        return binanceApiService.getServerTime();
    }

    @GetMapping(value = "/exchange-info")
    public Mono<ExchangeInfo> getExchangeInfo() {
        return binanceApiService.getExchangeInfo();
    }

    @GetMapping(value = "/order-book")
    public Mono<OrderBook> getOrderBook(@RequestParam("symbol") String symbol, @RequestParam("limit") Integer limit) {
        return binanceApiService.getOrderBook(symbol, limit);
    }

    @GetMapping(value = "/trades")
    public Mono<List<TradeHistoryItem>> getTrades(@RequestParam("symbol") String symbol, @RequestParam("limit") Integer limit) {
        return binanceApiService.getTrades(symbol, limit);
    }

    @GetMapping(value = "/historical-trades")
    public Mono<List<TradeHistoryItem>> getHistoricalTrades(@RequestParam("symbol") String symbol, @RequestParam("limit") Integer limit, @RequestParam("fromId") Long fromId) {
        return binanceApiService.getHistoricalTrades(symbol, limit, fromId);
    }

    @GetMapping(value = "/agg-trades")
    public Mono<List<AggTrade>> getAggTrades(@RequestParam("symbol") String symbol, @Nullable @RequestParam("limit") Integer limit,
                                             @Nullable @RequestParam("fromId") String fromId, @Nullable @RequestParam("startTime") Long startTime,
                                             @Nullable @RequestParam("endTime") Long endTime) {
        return binanceApiService.getAggTrades(symbol, fromId, limit, startTime, endTime);
    }
}
