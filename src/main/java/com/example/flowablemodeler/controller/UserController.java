package com.example.flowablemodeler.controller;

import org.flowable.ui.common.model.UserRepresentation;
import org.flowable.ui.common.security.DefaultPrivileges;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Flowable获取用户是调用idm服务，这里前端（/src/main/resources/static/scripts/configuration/url-config.js）修改获取用户信息接口自己实现接口
 *      整合到项目中，可以通过第三方API接口将User传过来
 * @ClassName: UserController
 * @author: Jack Chan
 * @date: 2019/8/12  15:01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/rest/account", method = RequestMethod.GET, produces = "application/json")
    public UserRepresentation getAccount() {
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setId("admin");
        userRepresentation.setEmail("admin@flowable.org");
        userRepresentation.setFullName("Test Administrator");
        userRepresentation.setLastName("Administrator");
        userRepresentation.setFirstName("Test");
        List<String> privileges = new ArrayList<>();
        privileges.add(DefaultPrivileges.ACCESS_MODELER);
        privileges.add(DefaultPrivileges.ACCESS_IDM);
        privileges.add(DefaultPrivileges.ACCESS_ADMIN);
        privileges.add(DefaultPrivileges.ACCESS_TASK);
        privileges.add(DefaultPrivileges.ACCESS_REST_API);
        userRepresentation.setPrivileges(privileges);
        return userRepresentation;
    }
}
