package pl.mwojcik.binanceapi.util;

import org.apache.commons.codec.binary.Hex;
import pl.mwojcik.binanceapi.util.exception.HmacSHA256SignerException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSHA256Signer {

    public static String sign(String message, String secret) {
        try {
            Mac hmacSHA256 = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            hmacSHA256.init(secretKeySpec);
            return new String(Hex.encodeHex(hmacSHA256.doFinal(message.getBytes())));
        } catch (Exception e) {
            throw new HmacSHA256SignerException("Unable to sign message.", e);
        }
    }

    private HmacSHA256Signer(){

    }
}