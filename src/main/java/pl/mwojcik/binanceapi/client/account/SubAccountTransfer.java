package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubAccountTransfer {

    private String counterParty;

    private String email;

    private Integer type; // 1 for transfer in, 2 for transfer out

    private String asset;

    private String qty;

    private String status;

    private Long tranId;

    private Long time;
}