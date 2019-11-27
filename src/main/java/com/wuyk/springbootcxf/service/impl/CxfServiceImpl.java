package com.wuyk.springbootcxf.service.impl;

import com.wuyk.springbootcxf.pojo.User;
import com.wuyk.springbootcxf.service.CxfService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by WUYK on 2019-11-27.
 */
@Service
@WebService(targetNamespace = "cxf")
public class CxfServiceImpl implements CxfService {

    @Override
    public User getUser(String id) {
        User user = new User();
        if ("1".equals(id)) {
            user.setId(1L);
            user.setName("wuyk");
            user.setPhone("15680809090");
            return user;
        }
        user.setId(2L);
        user.setName("wuyk2");
        user.setPhone("15680809092");
        return user;
    }

}
