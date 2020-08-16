package cn.campsg.gm.util;
import java.sql.*;

public class DBUtil {
	
	static String driver="com.mysql.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/student";
	static String user="root";
	static String password="Zzy201314.";
	static Connection con = null;

	public static Connection getConnection() { // 建立返回值为Connection的方法
		
		try { // 通过访问数据库的URL获取数据库连接对象
			Class.forName(driver);
			con =(Connection) DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
}
