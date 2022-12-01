package pl.mwojcik.binanceapi.util.exception;

public class HmacSHA256SignerException extends RuntimeException{

    public HmacSHA256SignerException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
