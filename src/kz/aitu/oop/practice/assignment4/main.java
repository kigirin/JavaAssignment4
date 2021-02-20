package kz.aitu.oop.practice.assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello!Press number of person or project you want to insert information");
        System.out.println("'1' is Senior Developer.'2' is Junior Developer.'3' is Program Manager.'4' is Project Manager");
        System.out.println("If you want register new project please enter '5'"); //asking user what he wants to input
        Scanner scan=new Scanner(System.in); //inputing function we want to use
        int answer=scan.nextInt(); //variable of function
        if (answer==1)
        {
                System.out.println("Enter id");//inputting information
                Scanner temp1=new Scanner(System.in);
                int id1=temp1.nextInt();

            System.out.println("Enter Name");
                Scanner temp2=new Scanner(System.in);
                String name1=temp2.nextLine();

            System.out.println("Enter surname");
                Scanner temp3=new Scanner(System.in);
                String surname1=temp3.nextLine();

            System.out.println("Enter age");
                Scanner temp4=new Scanner(System.in);
                int year1=temp4.nextInt();
            System.out.println("Enter gender");
                Scanner temp5=new Scanner(System.in);
                String gender1=temp5.nextLine();
            System.out.println("Enter phone number");
                Scanner temp6=new Scanner(System.in);
                String phone=temp6.nextLine();
            System.out.println("Enter email");
                Scanner temp7=new Scanner(System.in);
                String email=temp7.nextLine();
            System.out.println("Enter projects");
                Scanner temp8=new Scanner(System.in);
                String projectlist=temp8.next();

                SeniorDeveloper worker=new SeniorDeveloper(id1,name1,surname1,year1,gender1,phone,email,projectlist); //giving values
                worker.SeniorDeveloperSQL();//using method from class in order to insert to data to database
            }
        else if (answer==2){
            System.out.println("Enter id"); //inputting information
            Scanner temp1=new Scanner(System.in);
            int id1=temp1.nextInt();

            System.out.println("Enter Name");
            Scanner temp2=new Scanner(System.in);
            String name1=temp2.nextLine();

            System.out.println("Enter surname");
            Scanner temp3=new Scanner(System.in);
            String surname1=temp3.nextLine();

            System.out.println("Enter age");
            Scanner temp4=new Scanner(System.in);
            int year1=temp4.nextInt();
            System.out.println("Enter gender");
            Scanner temp5=new Scanner(System.in);
            String gender1=temp5.nextLine();
            System.out.println("Enter phone number");
            Scanner temp6=new Scanner(System.in);
            String phone=temp6.nextLine();
            System.out.println("Enter email");
            Scanner temp7=new Scanner(System.in);
            String email=temp7.nextLine();
            System.out.println("Enter specialization");
            Scanner temp8=new Scanner(System.in);
            String spec=temp8.nextLine();
            System.out.println("Enter project");
            Scanner temp9=new Scanner(System.in);
            String project=temp9.next();

            JuniorDeveloper worker=new JuniorDeveloper(id1,name1,surname1,year1,gender1,phone,email,spec,project); //giving values
            worker.JuniorDeveloperSQL(); // inserting information about object into our database
        }
        else if (answer==3){
            System.out.println("Enter id");//inputting information
            Scanner temp1=new Scanner(System.in);
            int id1=temp1.nextInt();

            System.out.println("Enter Name");
            Scanner temp2=new Scanner(System.in);
            String name1=temp2.nextLine();

            System.out.println("Enter surname");
            Scanner temp3=new Scanner(System.in);
            String surname1=temp3.nextLine();

            System.out.println("Enter age");
            Scanner temp4=new Scanner(System.in);
            int year1=temp4.nextInt();
            System.out.println("Enter gender");
            Scanner temp5=new Scanner(System.in);
            String gender1=temp5.nextLine();
            System.out.println("Enter phone number");
            Scanner temp6=new Scanner(System.in);
            String phone=temp6.nextLine();
            System.out.println("Enter email");
            Scanner temp7=new Scanner(System.in);
            String email=temp7.nextLine();
            System.out.println("Enter projects");
            Scanner temp8=new Scanner(System.in);
            String projects=temp8.next();
            ProgramManager worker=new ProgramManager(id1,name1,surname1,year1,gender1,phone,email,projects);//giving values
            worker.programmanagerSQL();//method of inserting info into database
        }
        else if (answer==4)
        {
            System.out.println("Enter id");//input information about object
            Scanner temp1=new Scanner(System.in);
            int id1=temp1.nextInt();

            System.out.println("Enter Name");
            Scanner temp2=new Scanner(System.in);
            String name1=temp2.nextLine();

            System.out.println("Enter surname");
            Scanner temp3=new Scanner(System.in);
            String surname1=temp3.nextLine();

            System.out.println("Enter age");
            Scanner temp4=new Scanner(System.in);
            int year1=temp4.nextInt();
            System.out.println("Enter gender");
            Scanner temp5=new Scanner(System.in);
            String gender1=temp5.nextLine();
            System.out.println("Enter phone number");
            Scanner temp6=new Scanner(System.in);
            String phone=temp6.nextLine();
            System.out.println("Enter email");
            Scanner temp7=new Scanner(System.in);
            String email=temp7.nextLine();
            System.out.println("Enter projects");
            Scanner temp8=new Scanner(System.in);
            String projectlist=temp8.next();

            ProjectManager worker=new ProjectManager(id1,name1,surname1,year1,gender1,phone,email,projectlist);//giving values
            worker.ProjectManagerSQL();//inserting to database
        }
        else if (answer==5){
            System.out.println("Enter name of project"); //input information
            Scanner temp1=new Scanner(System.in);
            String name1=temp1.nextLine();

            System.out.println("Enter price (USD)");
            Scanner temp2=new Scanner(System.in);
            Double price1=temp2.nextDouble();

            System.out.println("Enter date when you started work with project");
            Scanner temp3=new Scanner(System.in);
            String date1=temp3.nextLine();

            System.out.println("Enter description");
            Scanner temp4=new Scanner(System.in);
            String desc1=temp4.next();

            Project item=new Project(name1,price1,date1,desc1);//giving values
            item.projectSQL();//inserting to database
        }
    }
}
