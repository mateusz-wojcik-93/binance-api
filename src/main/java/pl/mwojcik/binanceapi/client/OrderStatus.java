package pl.mwojcik.binanceapi.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public enum OrderStatus {
  NEW,
  PARTIALLY_FILLED,
  FILLED,
  CANCELED,
  PENDING_CANCEL,
  REJECTED,
  EXPIRED
}
