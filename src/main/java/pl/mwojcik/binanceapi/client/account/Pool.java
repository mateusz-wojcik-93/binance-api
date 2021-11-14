package pl.mwojcik.binanceapi.client.account;

import lombok.Data;

import java.util.List;

@Data
public class Pool {

    private String poolId;
    private String poolName;
    private List<String> assets;
}
