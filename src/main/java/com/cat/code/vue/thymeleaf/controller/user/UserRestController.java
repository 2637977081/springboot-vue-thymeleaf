package com.cat.code.vue.thymeleaf.controller.user;

import com.cat.code.vue.thymeleaf.mode.response.ResponseJSONResult;
import com.cat.code.vue.thymeleaf.service.UserService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 12:01 2022/2/10
 **/
@RestController
@Slf4j
@RequestMapping("/cat/code/user")
public class UserRestController {

  @Resource
  private UserService userService;

  /**
   * 用户列表
   */
  @GetMapping(value = "/user_query")
  public ResponseJSONResult convertAppQuery(HttpServletRequest request) {
    return userService.getUserListInfo();
  }
}
