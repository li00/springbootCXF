package com.webservice.controller;

import com.webservice.dto.UserEntity;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 */
@RestController
public class ClientController {

    @RequestMapping("/client")
    public Object[] client(){
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8888/service/serviceDemo?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            //这里注意如果是复杂参数的话，要保证复杂参数可以序列化
            objects = client.invoke("method", "hello world!");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

}
