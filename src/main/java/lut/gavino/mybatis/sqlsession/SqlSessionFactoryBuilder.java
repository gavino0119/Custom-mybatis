package lut.gavino.mybatis.sqlsession;

/**
 * @Author: Yan Weigang
 * @Date: 2019/5/17 15:40
 * @Version 1.0
 */

import lut.gavino.mybatis.cfg.Configuration;
import lut.gavino.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import lut.gavino.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 *  用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }
}
