package com.wuyk.springbootcxf.config;

import com.wuyk.springbootcxf.service.CxfService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * WebService发布配置代码
 */
@Configuration
public class CxfConfig {

    private CxfService cxfService;

    @Autowired
    public CxfConfig(CxfService cxfService) {
        this.cxfService = cxfService;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        return new SpringBus();
    }

    /**
     * AX-WS站点服务
     * @return
     */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), cxfService);
        endpoint.publish("/test");
        return endpoint;
    }
}