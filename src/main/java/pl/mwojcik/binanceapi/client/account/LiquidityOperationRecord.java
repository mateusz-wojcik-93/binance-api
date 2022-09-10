package pl.mwojcik.binanceapi.client.account;

import lombok.Data;
import pl.mwojcik.binanceapi.client.dto.LiquidityOperationRecordStatus;

@Data
public class LiquidityOperationRecord {

    private String poolId;
    private String operationId;
    private String updateTime;
    private String operation;
    private String shareAmount;
    private String poolName;
    private LiquidityOperationRecordStatus status;
}
