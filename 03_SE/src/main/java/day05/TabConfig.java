package day05;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 用于读取配置文件的类
 *
 * @author j36
 */
public class TabConfig {
    /**
     * 用于读取properties文件的类
     */
    private Properties properties;

    /**
     * 根据给定的文件名读取配置文件
     *
     * @param fileName
     */
    public TabConfig(String fileName) {
        try {
            //	实例化Properties
            properties = new Properties();

            //	创建用于读取文本文件的字节输入流
            FileInputStream fis =
                    new FileInputStream("server_config_properties");

            // 使properties根据文件输入流读取配置信息
            properties.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TabConfig config = new TabConfig("server_config.properties");
        String port = config.getStringValue("port");
        System.out.println(port);
    }

    /**
     * 根据key获取字符串类型的value
     *
     * @param key
     * @return
     */
    public String getStringValue(String key) {
//		String value = properties.getProperty(key) ;
//		return value ;
        return properties.getProperty(key);
    }

    public int getIntValue(String key) {
        /**
         * 	String getProperty(String key , String defaultValue)
         * 	当给定的key在配置文件中不存在该项，返回之为第二个叁数的值
         */
        String value = properties.getProperty(key, "-1");
        return Integer.parseInt(value);
    }

}
