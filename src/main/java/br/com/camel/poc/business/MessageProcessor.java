package br.com.camel.poc.business;

import br.com.camel.poc.model.Message;

/**
 * @project: camel-rabbit-poc
 * @author: peo_aegidio@uolinc.com
 * @since: 23/06/15
 * @definition:
 */
public interface MessageProcessor {

    boolean process(Message message);
}
