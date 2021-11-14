package pl.mwojcik.binanceapi.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "binance")
public class BinanceProperties {

    private String baseUrl;
    private String pageBaseUrl;
    private String pingUrl;
    private String serverTimeUrl;
    private String exchangeInfoUrl;
    private String orderBookUrl;
    private String tradesUrl;
}
