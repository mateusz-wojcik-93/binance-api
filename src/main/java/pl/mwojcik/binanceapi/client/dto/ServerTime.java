package pl.mwojcik.binanceapi.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ServerTime {

    private Long serverTime;

    @Override
    public String toString() {
        return String.valueOf(serverTime);
    }
}
