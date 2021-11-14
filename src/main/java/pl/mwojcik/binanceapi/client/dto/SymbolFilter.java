package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SymbolFilter {

    private FilterType filterType;
    private String minPrice;
    private String maxPrice;
    private String tickSize;
    private String minQty;
    private String maxQty;
    private String stepSize;
    private String minNotional;
    private String maxNumAlgoOrders;
    private String limit;
}
