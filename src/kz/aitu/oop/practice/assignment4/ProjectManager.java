package kz.aitu.oop.practice.assignment4;

import java.sql.*;

public class ProjectManager extends Personal{
    public String ProjectName;//values

    public ProjectManager(int id, String name, String surname, int age, String gender, String phoneNumber, String email, String projectName) {//constructor
        super(id, name, surname, age, gender, phoneNumber, email);
        ProjectName = projectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }//getr and setr

    public String getProjectName() {
        return ProjectName;
    }
    private final String url="jdbc:postgresql://localhost/mydb";//information about database
    private final String user="postgres";
    private final String password="123";
    public void ProjectManagerSQL(){
        try{
            Connection connection= DriverManager.getConnection(url,user,password);//connection to postgresql
            Statement stmt=connection.createStatement();
            System.out.println("CONNECTION TRUE");
            PreparedStatement ps=connection.prepareStatement("INSERT INTO projectmanager VALUES(?,?,?,?,?,?,?,?)");//statement of inserting information
            ps.setInt(1,getId());//replacing question marks with our values
            ps.setString(2,getName());
            ps.setString(3,getSurname());
            ps.setInt(4,getId());
            ps.setString(5,getGender());
            ps.setString(6,getPhoneNumber());
            ps.setString(7,getEmail());
            ps.setString(8,getProjectName());
            ps.executeUpdate();//executing statement in postgre
        } catch (SQLException e){//catching error
            System.out.println(e.getMessage());
        }

    }
}
