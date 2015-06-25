package br.com.camel.poc.infra.camel.routes;

import br.com.camel.poc.business.StringMessageProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @project: camel-rabbit-poc
 * @author: peo_aegidio@uolinc.com
 * @since: 22/06/15
 * @definition:
 */
public class TestRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        from("rabbitmq://localhost:5672/camel-poc-exchange?exchangeType=fanout&autoDelete=false")
                .unmarshal().string("UTF-8")
                .bean(StringMessageProcessor.class);
    }
}
