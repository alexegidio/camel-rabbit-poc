package br.com.camel.poc.infra.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @project: camel-rabbit-poc
 * @author: peo_aegidio@uolinc.com
 * @since: 23/06/15
 * @definition:
 */
@Configuration
@EnableWebMvc
@ComponentScan("br.com.uol.billing.camel.poc")
//@PropertySource({"classpath:config-prod.properties","classpath:config-base.properties"})
@ImportResource({"classpath:application-context.xml","classpath:camel-context.xml"})
public class ApplicationConfig extends WebMvcConfigurerAdapter {
}
