package pl.mwojcik.binanceapi.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import pl.mwojcik.binanceapi.configuration.properties.BinanceProperties;

@Configuration
@AllArgsConstructor
public class BinanceWebClientConfiguration {

    private BinanceProperties binanceProperties;

    @Bean
    public WebClient binanceWebClient() {
        return WebClient.builder()
                        .exchangeStrategies(ExchangeStrategies.builder()
                                                              .codecs(configurer -> configurer
                                                                      .defaultCodecs()
                                                                      .maxInMemorySize(1024 * 1024 * 1024)) // 1024 MB
                                                              .build())
                        .baseUrl(binanceProperties.getBaseUrl())
                        .build();
    }
}
