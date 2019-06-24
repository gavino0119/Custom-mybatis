package lut.gavino.mybatis.test;

/**
 * @Author: Yan Weigang
 * @Date: 2019/5/18 15:45
 * @Version 1.0
 */

import lut.gavino.dao.IUserDao;
import lut.gavino.domain.User;
import lut.gavino.mybatis.io.Resources;
import lut.gavino.mybatis.sqlsession.SqlSession;
import lut.gavino.mybatis.sqlsession.SqlSessionFactory;
import lut.gavino.mybatis.sqlsession.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试类
 */
public class UserTest {
    @Test
    public void test(){
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        IUserDao mapper = session.getMapper(IUserDao.class);
        List<User> list = mapper.findAll();
        list.forEach(users -> System.out.println(users));

    }
}
