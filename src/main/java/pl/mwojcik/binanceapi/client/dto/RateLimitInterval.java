package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Rate limit intervals.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum RateLimitInterval {
  SECOND,
  MINUTE,
  DAY
}