package service;

import dao.UserDao;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// 把UserServiceImpl 这个类交给 IOC 容器进行管理
@Service("UserServiceImpl")
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        List<User> all = userDao.findAll();
        return all;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
        System.out.println( "我是业务层的保存所有");
    }
}
