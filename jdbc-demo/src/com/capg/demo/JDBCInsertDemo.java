package com.capg.demo;
import java.sql.*;
import java.util.Scanner;
public class JDBCInsertDemo {
 public static void main(String[] args) {
  String url="jdbc:oracle:thin:@localhost:1521:orcl";
  String user="scott";
  String password="tiger";
  Scanner in=new Scanner(System.in);
  try {
   // 1.Create Connection
   Connection con=DriverManager.getConnection(url,user,password);
   System.out.println("Connection successful");
   //2.Create Statement
   PreparedStatement psmt=con.prepareStatement("update stu2 where set age=? where roll=?");
   int roll;
   System.out.println("enter roll you want to update:");
   roll=in.nextInt();
   System.out.println("enter age you want to update:");
   int age=in.nextInt();
   //set the parameters
   psmt.setInt(2,roll);
   psmt.setInt(1,age);
//   Statement smt=con.createStatement();
   
//   int id;
//   String sname;
//   int age;
   
  // System.out.println("Enter id,sname,age");
//   id=in.nextInt();
//   sname=in.next()+in.nextLine();
//   age=in.nextInt();
   
     // 3. Execute Update
     int r=psmt.executeUpdate();
     if(r>0) 
     {
    	 System.out.println("updated successfully");
     }
     else {
    	 System.out.println("updation failed.......");
     }
  }
  catch(Exception ex) {
   ex.printStackTrace();
  }
 }
 }

