package com.wuyk.springbootcxf.service;

import com.wuyk.springbootcxf.pojo.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "cxf")
public interface CxfService {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @WebMethod
    User getUser(@WebParam(name = "id") String id);
}