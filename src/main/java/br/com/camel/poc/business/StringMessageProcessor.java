package br.com.camel.poc.business;

import br.com.camel.poc.business.exception.RecoverableException;
import org.apache.camel.Exchange;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * @project: camel-rabbit-poc
 * @author: peo_aegidio@uolinc.com
 * @since: 23/06/15
 * @definition:
 */
@Component
public class StringMessageProcessor {

    private AtomicInteger count  = new AtomicInteger(3);

    private Logger logger = Logger.getLogger(getClass());

    public void process(Exchange exchange) throws Exception {

        if (count.intValue() % 2 == 1) {
            exchange.setException(new RecoverableException("Unexpected error, try again"));
            count.incrementAndGet();
        } else {
            logger.info(String.format("Receiving message=%s", exchange.getIn().getBody()));
        }
    }

}
