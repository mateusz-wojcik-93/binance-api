package pl.mwojcik.binanceapi.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotEmpty;

@Data
@Configuration
@ConfigurationProperties(prefix = "binance")
public class BinanceProperties {

    @NotEmpty
    private String secretKey;
    @NotEmpty
    private String apiKey;
    @NotEmpty
    private String baseUrl;
    @NotEmpty
    private String pageBaseUrl;
    @NotEmpty
    private String pingUrl;
    @NotEmpty
    private String serverTimeUrl;
    @NotEmpty
    private String exchangeInfoUrl;
    @NotEmpty
    private String orderBookUrl;
    @NotEmpty
    private String tradesUrl;
    @NotEmpty
    private String historicalTradesUrl;
    @NotEmpty
    private String aggTradesUrl;
    @NotEmpty
    private String candlestickBarsUrl;
    @NotEmpty
    private String oneDayPriceUrl;
    @NotEmpty
    private String allOneDayPriceUrl;
    @NotEmpty
    private String allLatestPricesUrl;
    @NotEmpty
    private String latestPriceUrl;
    @NotEmpty
    private String allBookTickersUrl;

}
