package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) throws SQLException, Exception {
		Scanner scan = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm", "root", "tiger");

		boolean flag = true;
		PreparedStatement st;
		int value = 0;

		do {
			System.out.println(
					"Choose from the following to perform operation respectively:\n1.Insert a new Row\n2.Update a row\n3.Delete a Row\n4.Select the Row\n5.Exit");
			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					st = con.prepareStatement("Insert into Student values(?,?);");
					System.out.println("\nEnter ID of the new Student: ");
					st.setInt(1, scan.nextInt());
					System.out.println("Enter Name of the new Student: ");
					st.setString(2, scan.next());
					value = st.executeUpdate();
					System.out.println("\n" + value + " Row inserted into the Table");
					break;

				case 2:
					st = con.prepareStatement("Update Student set Name = ? where id = ?;");
					System.out.println("\nEnter the ID of the Student: ");
					st.setInt(2, scan.nextInt());
					System.out.println("Enter the new Name of the Student to update: ");
					st.setString(1, scan.next());
					value = st.executeUpdate();
					System.out.println("\n" + value + " Row updated in the Table");
					break;

				case 3:
					st = con.prepareStatement("Delete from Student where id = ?;");
					System.out.println("\nEnter the Student ID to delete: ");
					st.setInt(1, scan.nextInt());
					value = st.executeUpdate();
					System.out.println("\n" + value + " Row deleted from the Table");
					break;

				case 4:
					st = con.prepareStatement("Select * from Student where id = ?");
					System.out.println("\nEnter the Student ID to fetch their record: ");
					st.setInt(1, scan.nextInt());
					ResultSet rs = st.executeQuery();
					System.out.println("\nID\tName");
					while (rs.next()) {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
					}
					break;

				case 5:
					flag = false;
					break;

				default:
					System.out.println("\nEnter a valid option!!!");
			}
			System.out.println("\n-------------------------------------------------------------\n");
		} while (flag);

		scan.close();
		con.close();
	}
}