package com.capg.demo;
import java.sql.*;
import java.util.Scanner;
public class JDBCApp{
public static void main(String[] args) {
// TODO Auto-generated method stub

String url="jdbc:oracle:thin:@localhost:1521:orcl";
String user="scott";
String password="tiger";
try
{ //1.create connection
Connection con=DriverManager.getConnection(url, user, password);
//System.out.println("connection successful");

//2.create statement
            Statement smt=con.createStatement();
// System.out.println("ENTER Roll=");
//     int Roll=new Scanner(System.in).nextInt();
// System.out.println("ENTER Name=");
// String name=new Scanner(System.in).nextLine();
          System.out.println("Enter roll");
        int roll=new Scanner(System.in).nextInt();

//3.Execute Query
ResultSet rs=smt.executeQuery("select * from stu2 where roll="+roll);


//4. processing ResultSet
// if(!rs.next()){
// System.out.println("no data found");
//
// }
// else {
// rs.previous();
System.out.printf("%-10s%-30s%-10s\n","Roll","Name","Age");

while(rs.next())
{
System.out.printf("%-10d",rs.getInt("roll"));
System.out.printf("%-30s",rs.getString(2));
System.out.printf("%-10d",rs.getInt(3));
System.out.println();
}
// }
}
catch(SQLException e)
{
e.printStackTrace();
}

}

}

