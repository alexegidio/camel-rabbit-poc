package br.com.camel.poc.business;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
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

    public void process(String message) throws Exception {

        logger.info(String.format("Receiving message=%s", message));
    }

}
