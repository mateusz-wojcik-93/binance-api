package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum ExecutionType {
  NEW,
  CANCELED,
  REPLACED,
  REJECTED,
  TRADE,
  EXPIRED
}