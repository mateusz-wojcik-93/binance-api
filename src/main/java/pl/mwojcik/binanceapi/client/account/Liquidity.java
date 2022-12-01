package pl.mwojcik.binanceapi.client.account;

import lombok.Data;

import java.util.Map;

@Data
public class Liquidity {

    private String poolId;
    private String poolName;
    private Long updateTime;
    private Map<String, String> liquidityMap;
    private Share share;

    @Data
    public static class Share {
        private double shareAmount;
        private double sharePercentage;
        private Map<String, String> asset;
    }
}