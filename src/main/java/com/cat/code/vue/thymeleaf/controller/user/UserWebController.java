package com.cat.code.vue.thymeleaf.controller.user;

import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: lvgang
 * @Desc:
 * @Time: 12:01 2022/2/10
 **/
@Controller
@Slf4j
@RequestMapping("/cat/code/user")
public class UserWebController {
  /**
   * 用户列表页面
   */
  @RequestMapping(value = "/query", method = {RequestMethod.GET, RequestMethod.POST})
  public String getUserList(HttpServletRequest request) {
    return "user/user_query";
  }
}
