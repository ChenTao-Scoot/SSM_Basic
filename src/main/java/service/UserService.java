package service;

import domain.User;

import java.util.List;

public interface UserService {

    // 查询返回所有
    public List<User> findAll();

    // 查询保存所有
    public  void save (User user);
}
