package lut.gavino.mybatis.io;

/**
 * @Author: Yan Weigang
 * @Date: 2019/5/16 10:51
 * @Version 1.0
 */
/**
 *
 * <p>Title: Resources</p>
 * <p>Description: 用于读取配置文件的类</p>
 */
import java.io.InputStream;

/**
 * 使用类加载器读取配置文件的类
 */
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
