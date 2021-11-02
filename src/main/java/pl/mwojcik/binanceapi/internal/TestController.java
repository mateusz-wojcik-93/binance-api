package pl.mwojcik.binanceapi.internal;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mwojcik.binanceapi.client.BinanceApiService;
import pl.mwojcik.binanceapi.client.dto.ExchangeInfo;
import pl.mwojcik.binanceapi.client.dto.ServerTime;
import reactor.core.publisher.Mono;

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
    public Mono<Object> getExchangeInfo() {
        return binanceApiService.getExchangeInfo();
    }
}
