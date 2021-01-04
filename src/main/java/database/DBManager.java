package database;

import constants.Constants;
import entity.Discipline;
import entity.Student;

import java.sql.*;
import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Student> getAllActiveStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE status = '1'");

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setSername(rs.getString("sername"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));
                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void createNewStudent(String sername, String name,  String group, String date) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `students_15`.`student` (`sername`, `name`, `group`, `date`) VALUES ('"+sername+"', '"+name+"', '"+group+"', '"+date+"');");
            System.out.println("hello");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void createNewDisc(String disc) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO `students_15`.`discipline` (`discipline`) VALUES ('" + disc + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Discipline> getAllActiveDisciplines() {
        ArrayList<Discipline> disciplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM discipline WHERE status = '1';");

            while (rs.next()) {
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));
                disciplines.add(discipline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplines;
    }

    public static void  deleteDisc(String id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `status` = '0' WHERE (`id` = "+id+");");
            }
         catch (Exception e) {
             e.printStackTrace();
         }
    }
    public static Discipline getDisciplineById(String id) {
       Discipline discipline = new Discipline();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM discipline WHERE status = '1' AND id = "+id+";");

            while (rs.next()) {
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return discipline;
    }
    public static void modifyDisc(String id, String disc){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `discipline` SET `discipline` = '"+disc+"' WHERE (`id` = '"+id+"');");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void  deleteStud(String id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `student` SET `status` = '0' WHERE (`id` = "+id+");");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void modifyStud(String id, String sername, String name, String group, String date){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `student` SET `sername` = '"+sername+"', `name` = '"+name+"', `group` = '"+group+"', `date` = '"+date+"' WHERE (`id` = '"+id+"');");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Student getStudentById(String id) {
        Student student = new Student();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(Constants.PATH_TO_DATABASE);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE status = '1' AND id = "+id+";");

            while (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setSername(rs.getString("sername"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }
    }



