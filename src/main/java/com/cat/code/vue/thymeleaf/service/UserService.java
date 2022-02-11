package com.cat.code.vue.thymeleaf.service;

import com.cat.code.vue.thymeleaf.mode.User;
import com.cat.code.vue.thymeleaf.mode.response.ResponseCode;
import com.cat.code.vue.thymeleaf.mode.response.ResponseJSONResult;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 12:13 2022/2/10
 **/
@Service
@Slf4j
public class UserService {

  //获取用户列表
  public ResponseJSONResult getUserListInfo() {
    String methodName = "get user list info";
    log.info("{}, param: {}", methodName, null);
    List<User> userList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      User user = User.builder().id(i).username("admin" + i).age(15 + i).password("123456").build();
      userList.add(user);
    }
    //构建结果集
    return ResponseJSONResult.builder().code(ResponseCode.SUCCESS.getCode())
        .message(ResponseCode.SUCCESS.getMessage()).result(userList).build();
  }
}
