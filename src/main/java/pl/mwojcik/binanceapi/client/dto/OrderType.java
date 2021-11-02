package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public enum OrderType {
  LIMIT,
  MARKET,
  STOP_LOSS,
  STOP_LOSS_LIMIT,
  TAKE_PROFIT,
  TAKE_PROFIT_LIMIT,
  LIMIT_MAKER
}
