package dao;

import domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    // 查询返回所有
    @Select("select * from user")
  public   List<User> findAll();

    // 查询保存所有
    @Insert("insert into user(name,money) values(#{name},#{money})")
    public  void save (User user);

}
