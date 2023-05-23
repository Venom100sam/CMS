package UI;
import java.sql.*;
public class CheckConnection {
    String url = "jdbc:mysql://localhost";
    String username = "root";
    String password = "";
    void checkConnection(){
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create the connection
            Connection connect = DriverManager.getConnection(url,username,password);
               
            if(!connect.isClosed()) {
                System.out.println("Open");
            }
            //close the statement
            connect.close();
        }catch (Exception exp){
            System.out.println(exp);
        }
    }
    public static void main(String[] args) {
        CheckConnection dem = new CheckConnection();
        dem.checkConnection();
       
    }
}


