package pl.mwojcik.binanceapi.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public enum OrderRejectReason {
  NONE,
  UNKNOWN_INSTRUMENT,
  MARKET_CLOSED,
  PRICE_QTY_EXCEED_HARD_LIMITS,
  UNKNOWN_ORDER,
  DUPLICATE_ORDER,
  UNKNOWN_ACCOUNT,
  INSUFFICIENT_BALANCE,
  ACCOUNT_INACTIVE,
  ACCOUNT_CANNOT_SETTLE,
  ORDER_WOULD_TRIGGER_IMMEDIATELY
}