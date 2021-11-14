package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Withdraw {

    private String amount;
    private String address;
    private String asset;
    private String applyTime;
    private String successTime;
    private String txId;
    private String id;
    private int status;
}
