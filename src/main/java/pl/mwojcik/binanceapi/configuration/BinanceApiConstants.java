package pl.mwojcik.binanceapi.configuration;

public class BinanceApiConstants {

    public static final String API_KEY_HEADER = "X-MBX-APIKEY";

    public static final String ENDPOINT_SECURITY_TYPE_APIKEY = "APIKEY";
    public static final String ENDPOINT_SECURITY_TYPE_APIKEY_HEADER = ENDPOINT_SECURITY_TYPE_APIKEY + ": #";

    public static final String ENDPOINT_SECURITY_TYPE_SIGNED = "SIGNED";
    public static final String ENDPOINT_SECURITY_TYPE_SIGNED_HEADER = ENDPOINT_SECURITY_TYPE_SIGNED + ": #";

    public static final long DEFAULT_RECEIVING_WINDOW = 60_000L;

    public static final long DEFAULT_MARGIN_RECEIVING_WINDOW = 5_000L;

}
