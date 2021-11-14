package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ExchangeInfo {

    private String timezone;
    private Long serverTime;
    private List<RateLimit> rateLimits;
    private List<String> exchangeFilters;
    private List<SymbolInfo> symbols;

}
