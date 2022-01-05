package top.learningwang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author wangjingbiao
 * createDate: 2022/1/5 周三 4:00 PM
 * desc:
 */
public class Driver {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "user1";
        String password = "123456";

        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(url, user, password);
    }
}
