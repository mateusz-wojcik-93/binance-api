package pl.mwojcik.binanceapi.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public enum TransferType {
    SPOT_TO_MARGIN("1"),
    MARGIN_TO_SPOT("2");

    private String value;

    TransferType(String value) {
        this.value = value;
    }
}
