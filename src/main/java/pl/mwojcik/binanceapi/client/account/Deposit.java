package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deposit {

    private String amount;

    private String asset;

    private String insertTime;

    private String txId;

    private int status;

}
