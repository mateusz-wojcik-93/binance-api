package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Rate limiters.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum RateLimitType {
  REQUEST_WEIGHT,
  ORDERS
}
