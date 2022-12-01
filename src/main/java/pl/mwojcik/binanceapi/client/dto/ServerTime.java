package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ServerTime {

    private Long serverTimeValue;

    @Override
    public String toString() {
        return String.valueOf(serverTimeValue);
    }
}
