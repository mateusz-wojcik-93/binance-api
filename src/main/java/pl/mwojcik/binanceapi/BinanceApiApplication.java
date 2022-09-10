package pl.mwojcik.binanceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableConfigurationProperties
@SpringBootApplication
public class BinanceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinanceApiApplication.class, args);
    }

}
