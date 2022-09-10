package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.mwojcik.binanceapi.client.dto.LoanStatus;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Repay {

    private String amount;
    private String asset;
    private String interest;
    private String principal;
    LoanStatus status;
    private long timestamp;
    private String txId;
}
