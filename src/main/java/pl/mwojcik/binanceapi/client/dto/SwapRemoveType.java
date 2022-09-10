package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum SwapRemoveType {
    SINGLE, COMBINATION
}
