package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/11/25
 * �̸� : ���ϸ�
 * ���� : JDBC DELETE �ǽ� ���� p522
 */
public class DeleteTest {

	public static void main(String[] args) throws Exception {

		// DB����
		String host = "jdbc:mysql://192.168.10.114:3306/khr";
		String user = "khr";
		String pass = "1234";

		// 1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");

		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);

		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();

		// 4�ܰ� - SQL ����

		String sql = "DELETE FROM `USER3` WHERE `uid`='B102'";
		stmt.executeUpdate(sql);

		// 5�ܰ� - �����(ResultSEt) ó��(SELECT�� ���)

		// 6�ܰ� - �����ͺ��̽� ����
		conn.close();
		System.out.println("DELETE �Ϸ�...");

	}
}