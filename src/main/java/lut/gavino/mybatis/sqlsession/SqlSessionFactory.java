package lut.gavino.mybatis.sqlsession;

/**
 * @Author: Yan Weigang
 * @Date: 2019/5/17 15:52
 * @Version 1.0
 */
public interface SqlSessionFactory {

    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
