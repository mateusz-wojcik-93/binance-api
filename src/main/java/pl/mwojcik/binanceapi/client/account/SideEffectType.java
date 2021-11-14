package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum SideEffectType {
    NO_SIDE_EFFECT,
    MARGIN_BUY,
    AUTO_REPAY
}

