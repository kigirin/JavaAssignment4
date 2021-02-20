package kz.aitu.oop.practice.assignment4;
import java.sql.*;

public class SeniorDeveloper extends Personal{
    public SeniorDeveloper(int id, String name, String surname, int age, String gender, String phoneNumber, String email, String projectLists) { //constructor
        super(id, name, surname, age, gender, phoneNumber, email);
        ProjectLists = projectLists;
    }

    private String ProjectLists;//values

    public void setProjectLists(String projectLists) {
        ProjectLists = projectLists;
    }//setr and getr

    public String getProjectLists() {
        return ProjectLists;
    }
    private final String url="jdbc:postgresql://localhost/mydb";//information about database
    private final String user="postgres";
    private final String password="123";
    public void SeniorDeveloperSQL(){//method of inserting data to server
        try{
            Connection connection= DriverManager.getConnection(url,user,password);//connection to server
            Statement stmt=connection.createStatement();
            System.out.println("CONNECTION TRUE");
            PreparedStatement ps=connection.prepareStatement("INSERT INTO seniordeveloper VALUES(?,?,?,?,?,?,?,?)");//statemnt of inserting data
            ps.setInt(1,getId());// replacing question marks with our information
            ps.setString(2,getName());
            ps.setString(3,getSurname());
            ps.setInt(4,getId());
            ps.setString(5,getGender());
            ps.setString(6,getPhoneNumber());
            ps.setString(7,getEmail());
            ps.setString(8,getProjectLists());
            ps.executeUpdate();//execution in postgre
        } catch (SQLException e){//catching an error
            System.out.println(e.getMessage());
        }

    }
}

