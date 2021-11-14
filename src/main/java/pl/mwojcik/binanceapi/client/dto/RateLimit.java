package pl.mwojcik.binanceapi.client.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RateLimit {

  private RateLimitType rateLimitType;
  private RateLimitInterval interval;
  private Integer limit;
}
