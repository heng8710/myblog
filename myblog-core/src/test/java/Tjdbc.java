import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Tjdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		String host = "192.168.1.104";
		String port = "3306";
		String dbName = "blog701";
		String UserName = "blog701";// 数据库用户登陆名 ( 也有说是 schema 名字的 )
		String Password = "heng";// 密码
		String url = "jdbc:mysql://"+host+":"+port+"/"+dbName;
		conn = DriverManager.getConnection(url, UserName, Password);
		System.out.println(conn);
		ResultSet rs = conn.createStatement().executeQuery("select * from category");
		while(rs.next()){
			System.out.println(rs.getString("name"));
		}
		conn.close();
	}

}
