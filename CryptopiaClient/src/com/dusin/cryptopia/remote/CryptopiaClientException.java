
package com.dusin.cryptopia.remote;

/**
 *
 * Created by Dylan Janeke on 2017/06/22.
 */
public class CryptopiaClientException extends RuntimeException {
    public CryptopiaClientException(String message) {
        super(message);
    }

    public CryptopiaClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
