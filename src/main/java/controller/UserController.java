package controller;


import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/FindAll")
    public String findAll(){
        System.out.println("Spring mvc 的查询");

        // 如果能在这里调取业务层的方法,代表整合成功

        userService.findAll();
        return  "list";
    }

    @RequestMapping("/save")
    // 会自动把表单里的值,封装到JavaBean 中
    public  String save(User user){
        userService.save(user);
        return "list";
    }
}
