package br.com.camel.poc.business;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;


/**
 * @project: camel-rabbit-poc
 * @author: peo_aegidio@uolinc.com
 * @since: 23/06/15
 * @definition:
 */
@Component
public class StringMessageProcessor {

    private Logger logger = Logger.getLogger(getClass());

    public boolean process(Exchange camelExchange) {
        Boolean result = true;

        //logger.info("Receiving message=" + camelExchange.getIn().getBody());

        logger.info(String.format("Receiving message=%s, camelExchange=%s", camelExchange.getIn().getBody(),
                camelExchange));

        return result;
    }
}
