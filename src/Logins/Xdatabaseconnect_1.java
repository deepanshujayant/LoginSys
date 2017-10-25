/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Logins;

/**
 *
 * @author test
 */
import java.sql.*;
public class Xdatabaseconnect_1 {

    Connection databaseconnect(){
        Connection con=null;
         try{
            // Step 1  Register the driver class
                Class.forName("com.mysql.jdbc.Driver");

                // Step 2 Create the connection object
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

                //Step 3 Create the Statement object
                 //here college is database name, root is username and password
                  //Statement stmt= con.createStatement();

                  

                  //step 4 Execute the query
                 // ResultSet rs=stmt.executeQuery("select * from data");


                 //Step5  Close the connection object
                 // con.close();
        }
       catch(Exception e){
           System.out.println(e);

        }
    return con;
}
}

