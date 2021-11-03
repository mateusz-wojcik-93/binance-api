
# Binance Reactive Api

A Reactive library to handle api binance


## Authors

- [@mateusz-wojcik-93](https://www.github.com/mateusz-wojcik-93)


## Usage/Examples

```java
import pl.mwojcik.binanceapi.client.BinanceApiService;

@Service
@AllArgsConstructor
public class BinancePingService {

    private BinanceApiService binanceApiService;

    public Mono<Void> get() {
        return binanceApiService.ping();
    }
```
