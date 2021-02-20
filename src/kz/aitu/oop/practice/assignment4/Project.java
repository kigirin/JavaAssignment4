package kz.aitu.oop.practice.assignment4;

import java.sql.*;

public class Project {
    private String name; //values
    private double CostInUSD;
    private String Date; //day when project started work
    private String description;

    public Project(String name, double costInUSD, String date, String description) {
        this.name = name;
        CostInUSD = costInUSD;
        Date = date;
        this.description = description;//constructor
    }

    public void setName(String name) {
        this.name = name;
    }//setr and getr

    public String getName() {
        return name;
    }

    public void setCostInUSD(int costInUSD) {
        CostInUSD = costInUSD;
    }

    public double getCostInUSD() {
        return CostInUSD;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDate() {
        return Date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    private final String url="jdbc:postgresql://localhost/mydb";//information about our database
    private final String user="postgres";
    private final String password="123";
    public void projectSQL(){
        try{
            Connection connection= DriverManager.getConnection(url,user,password);//connection to our database
            Statement stmt=connection.createStatement();
            System.out.println("CONNECTION TRUE");
            PreparedStatement ps=connection.prepareStatement("INSERT INTO project VALUES(?,?,?,?)");//statement of inserting information
            ps.setString(1,getName()); //replacing questing marks with our values
            ps.setDouble(2,getCostInUSD());
            ps.setString(3,getDate());
            ps.setString(4,getDescription());
            ps.executeUpdate();//execution of our statement in postgre
        } catch (SQLException e){//catching error
            System.out.println(e.getMessage());
        }
    }

}
