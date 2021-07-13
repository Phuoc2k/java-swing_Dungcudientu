package ketNoiCSDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiCSDL {
	public static Connection getKetNoi() {
		Connection ketNoi = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyLinhKien";
			try {
				ketNoi = DriverManager.getConnection(url, "sa", "sapassword");
//				System.out.println("Kết nối cơ sở dữ liệu thành công!!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketNoi;
	}
	
	public static void main(String[] args) {
		System.out.println(getKetNoi());
	}
}
