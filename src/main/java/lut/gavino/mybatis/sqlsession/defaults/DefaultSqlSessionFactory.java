package lut.gavino.mybatis.sqlsession.defaults;

/**
 * @Author: Yan Weigang
 * @Date: 2019/5/17 16:32
 * @Version 1.0
 */

import lut.gavino.mybatis.cfg.Configuration;
import lut.gavino.mybatis.sqlsession.SqlSession;
import lut.gavino.mybatis.sqlsession.SqlSessionFactory;

/**
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
