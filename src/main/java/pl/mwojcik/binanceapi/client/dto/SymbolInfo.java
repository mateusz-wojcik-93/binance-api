package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SymbolInfo {

  private String symbol;

  private SymbolStatus status;

  private String baseAsset;

  private Integer baseAssetPrecision;

  private String quoteAsset;

  private Integer quotePrecision;

  private List<OrderType> orderTypes;

  private boolean icebergAllowed;

  private boolean ocoAllowed;

  private boolean quoteOrderQtyMarketAllowed;

  private boolean isSpotTradingAllowed;

  private boolean isMarginTradingAllowed;

  private List<SymbolFilter> filters;
}
