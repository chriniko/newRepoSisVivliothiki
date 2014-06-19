package utils;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author nikos
 */
public class SessionIdentifierGenerator {

    private final SecureRandom random;

    public SessionIdentifierGenerator() {
        random = new SecureRandom();
    }

    public String nextSessionId() {
        return new BigInteger(60, random).toString(32);
    }

}//SessionIdentifierGenerator
