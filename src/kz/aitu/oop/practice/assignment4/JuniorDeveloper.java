package kz.aitu.oop.practice.assignment4;

import java.sql.*;

public class JuniorDeveloper extends Personal{ //extending class personal


    private String Specialist; //variables
    private String Project;

    public JuniorDeveloper(int id, String name, String surname, int age, String gender, String phoneNumber, String email, String specialist, String project) { //constructors
        super(id, name, surname, age, gender, phoneNumber, email);
        Specialist = specialist;
        Project = project;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    } //setr and getr
    public String getSpecialist() {
        return Specialist;
    }


    public void setProject(String project) {
        Project = project;
    }

    public String getProject() {
        return Project;
    }


    private final String url="jdbc:postgresql://localhost/mydb"; //information about database.(individual for every user)
    private final String user="postgres";
    private final String password="123";
    public void JuniorDeveloperSQL(){ //method of inserting info
        try{
            Connection connection= DriverManager.getConnection(url,user,password); //conecting to postgre
            Statement stmt=connection.createStatement();
            System.out.println("CONNECTION TRUE");
            PreparedStatement ps=connection.prepareStatement("INSERT INTO juniordeveloper VALUES(?,?,?,?,?,?,?,?,?)"); //inserting information
            ps.setInt(1,getId()); // replacing question marks with info from constructor
            ps.setString(2,getName());
            ps.setString(3,getSurname());
            ps.setInt(4,getId());
            ps.setString(5,getGender());
            ps.setString(6,getPhoneNumber());
            ps.setString(7,getEmail());
            ps.setString(8,getSpecialist());
            ps.setString(9,getProject());
            ps.executeUpdate();//execution of statement in postgre
        } catch (SQLException e){ //catching error
            System.out.println(e.getMessage());
        }
    }
}
