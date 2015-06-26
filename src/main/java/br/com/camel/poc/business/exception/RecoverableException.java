package br.com.camel.poc.business.exception;

/**
 * @project: camel-rabbit-poc
 * @author: peo_aegidio@uolinc.com
 * @since: 26/06/15
 * @definition:
 */
public class RecoverableException extends RuntimeException {

    public RecoverableException() {
    }

    public RecoverableException(String message) {
        super(message);
    }

    public RecoverableException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecoverableException(Throwable cause) {
        super(cause);
    }

    public RecoverableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
