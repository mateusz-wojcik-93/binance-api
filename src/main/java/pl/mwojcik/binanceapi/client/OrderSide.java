package pl.mwojcik.binanceapi.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public enum OrderSide {
  BUY,
  SELL
}
