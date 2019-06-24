package lut.gavino.dao;

import lut.gavino.domain.User;
import lut.gavino.mybatis.annotations.Select;

import java.util.List;

/**
 * @Author: Yan Weigang
 * @Date: 2019/5/18 18:32
 * @Version 1.0
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
