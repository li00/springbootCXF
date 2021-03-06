package com.webservice.service;

import com.webservice.dto.UserEntity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author
 */
@WebService
public interface ServiceDemo {
    @WebMethod
    String method(@WebParam String data);
}
