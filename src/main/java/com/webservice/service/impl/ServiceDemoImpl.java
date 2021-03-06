package com.webservice.service.impl;

import com.webservice.dto.UserEntity;
import com.webservice.service.ServiceDemo;
import org.springframework.stereotype.Service;

import javax.jws.WebService;


/**
 * @author
 */
@Service
@WebService(serviceName = "ServiceDemo",targetNamespace = "http://service.webservice.com/",
        endpointInterface = "com.webservice.service.ServiceDemo")
public class ServiceDemoImpl implements ServiceDemo {

    @Override
    public String method(String data) {
        return data;
    }
}
