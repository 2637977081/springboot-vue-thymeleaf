# springboot-vue-thymeleaf
springboot+vue+thymeleaf 全栈组合开发

# 当前页面预览
![image](https://user-images.githubusercontent.com/28625390/153527737-7b28f968-1698-4ea8-87f0-c2a4e6be8237.png)


# 前端组件使用 element-ui
文档访问地址：https://element.eleme.cn/#/zh-CN/component

# 主要依赖 thymeleaf
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-thymeleaf</artifactId>
      <version>${spring-boot.version}</version>
    </dependency>
    
# 配置文件主要配置
    spring.thymeleaf.prefix=classpath:/templates/
    spring.thymeleaf.suffix=.html
    spring.thymeleaf.mode=HTML
    spring.thymeleaf.encoding=UTF-8
    spring.thymeleaf.cache=false
    
 # 资源文件结构
![image](https://user-images.githubusercontent.com/28625390/153527289-1bbbf86f-5872-45e0-883f-ffd9a3b4a731.png)

    axios：用于发送请求，调用restful接口
    element-ui：element的组件资源
    vue：vue的支持文件
    js：项目页面对应的js文件
    
# SpringBoot Controller层
![image](https://user-images.githubusercontent.com/28625390/153527368-16e92112-d6bc-4491-8cd9-47f2c8ece1dd.png)

    WebController 主要对应页面请求地址，使用@Controller 注解，参数返回页面相对地址
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

    
    RestController 主要对应RestFul接口，使用@RestController 注解
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
