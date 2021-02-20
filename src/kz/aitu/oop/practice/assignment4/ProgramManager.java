package kz.aitu.oop.practice.assignment4;

import java.sql.*;

public class ProgramManager extends Personal{


    private String NameOfGroupOfProjects; //values

    public ProgramManager(int id, String name, String surname, int age, String gender, String phoneNumber, String email, String nameOfGroupOfProjects) {
        super(id, name, surname, age, gender, phoneNumber, email);
        NameOfGroupOfProjects = nameOfGroupOfProjects;//constructor
    }

    public void setNameOfGroupOfProjects(String nameOfGroupOfProjects) {
        NameOfGroupOfProjects = nameOfGroupOfProjects; //setr and getr
    }

    public String getNameOfGroupOfProjects() {
        return NameOfGroupOfProjects;
    }
    private final String url="jdbc:postgresql://localhost/mydb";//information about database
    private final String user="postgres";
    private final String password="123";
    public void programmanagerSQL(){
        try{
            Connection connection= DriverManager.getConnection(url,user,password);//connecting to database
            Statement stmt=connection.createStatement();
            System.out.println("CONNECTION TRUE");
            PreparedStatement ps=connection.prepareStatement("INSERT INTO programmanager VALUES(?,?,?,?,?,?,?,?)");//statement of inserting info
            ps.setInt(1,getId());//replacing question marks with our values
            ps.setString(2,getName());
            ps.setString(3,getSurname());
            ps.setInt(4,getId());
            ps.setString(5,getGender());
            ps.setString(6,getPhoneNumber());
            ps.setString(7,getEmail());
            ps.setString(8,getNameOfGroupOfProjects());
            ps.executeUpdate();//exucting of our statement in postgre
        } catch (SQLException e){ //catching error
            System.out.println(e.getMessage());
        }

    }
}
