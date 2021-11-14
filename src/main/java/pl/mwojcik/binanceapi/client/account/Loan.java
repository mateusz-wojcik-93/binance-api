package pl.mwojcik.binanceapi.client.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.mwojcik.binanceapi.client.LoanStatus;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Loan {

    private String asset;
    private String principal;
    private long timestamp;
    private LoanStatus status;
}
