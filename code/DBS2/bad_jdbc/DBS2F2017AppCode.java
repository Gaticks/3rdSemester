package DBS2.bad_jdbc;
/*   Main class. Handles creation and disposal of a connection to Oracle */
/*   The individual case to be run is instantiated and passed the        */
/*   connection                                                          */

import java.sql.*;

public class DBS2F2017AppCode {

	private static Connection conn;

	/* connection details */
	/* connects via TNS */

	final static String connectString = "jdbc:oracle:thin:@localhost:1521:orcl";
	final static String userName = "root";
	final static String password = "password";

	public static void main(String[] args) {

		try {
//			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			conn = DriverManager.getConnection(connectString, userName, password);
			conn.setAutoCommit(false);
			System.out.println("connection established, autocommit off");
			
			/*
			 * Individual questions are instantiated and run here Each question is a
			 * specialization of the QuestionRunner class
			 */

			try {
				QuestionRunner q = new QuestionOne(conn);
				q.execute();
			} catch (Exception e) {
				System.out.println("error running case, see messages for details");
				System.out.println(e.getMessage());
				e.printStackTrace();

			}

			try {
				QuestionRunner q = new QuestionTwo(conn);
				q.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				QuestionRunner q = new QuestionThree(conn);
				q.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				QuestionRunner q = new QuestionFour(conn);
				q.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				QuestionRunner q = new QuestionFive(conn);
				q.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}try {
				QuestionRunner q = new QuestionSix(conn);
				q.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}try {
				QuestionRunner q = new QuestionSeven(conn);
				q.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			System.out.println("error establishing connection");
			System.out.println("Connection string in use: "+connectString + "(user/pwd " + userName + "/" + password + ")" );
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		try {
			conn.close();
			System.out.println("connection closed");

		} catch (SQLException e) {
			System.out.println("error closing connection");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);

		}
	}
}
