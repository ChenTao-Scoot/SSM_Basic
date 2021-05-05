import domain.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.util.List;

public class SpringTest {
    @Test
    public void test_Spring(){

        // 加载配置文件 配置文件里面用拥有Ioc 容器管理的对象
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // 获取容器里面注入的对象  通过在注解上面加的名称
        UserService userServiceImpl = (UserService)cs.getBean("UserServiceImpl");

        List<User> all = userServiceImpl.findAll();
        for (User user:all){
            System.out.println(user);
        }

        System.out.println("这是我修改的git 版本信息");
        
        System.out.println("看看你能不能拉取下来")
    }
}
