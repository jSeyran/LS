import com.mysql.fabric.jdbc.FabricMySQLDriver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by Admin on 16.05.2017.
 */

public class Sign_in extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        RegUSer newuser = new RegUSer(request.getParameter("nikname"), request.getParameter("password"));

        String root="root";
        String ServerURL="jdbc:mysql://127.0.0.1:3305/dbtest";
        String pass="mroot";
        Connection connection;
        String testpass="";

        try {
            Driver a = new FabricMySQLDriver();

            DriverManager.registerDriver(a);
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(ServerURL, root, pass);

              Statement statement=connection.createStatement();

              String zapros="select regtest.password from regtest where nickname= '" +newuser.getNickname()+ "';" ;
              ResultSet RS=statement.executeQuery(zapros);
              while(RS.next()){
            testpass= RS.getString(1);}
             connection.close();
        } catch ( Exception e) {
            System.out.println("BOOOM! statement! --->>"+testpass+" "+newuser.getPassword()
                    +"  "+newuser.getNickname()+" " + e.getMessage());
        }


         if(testpass.equals(newuser.getPassword())) {

             out.print("<html>\n" + "  <head>\n" + "    <title>OK!</title>\n" + "  </head>\n" + "  <style>\n" + "    h4 {\n" + "      font-family: 'Times New Roman', Times, serif; /* Гарнитура текста */\n" + "      font-size: 250%; /* Размер шрифта в процентах */\n" + "    }\n" + "\n" + "  </style>\n" + "\n" + "<h4 style=\"text-align: center;\"><b><var>J.U.D код от Души....</var></b></h4>\n" + "<p align=\"center\"><var><img alt=\"\" height=\"348\" src=\"http://judteam.xyz/gallery_gen/8ff3c8d2412b9655cbeb0151f7c8ec6a_1040x696.90721649485.jpg\" width=\"520\"></var></p>\n" + "<form action=\"Servlet\" method=\"post\" target=\"_blank\">\n" + "\t<h1 style=\"text-align: center;\"><var>Registration</var></h1>\n" + "\t<h1 style=\"text-align: center;\"><var>&nbsp;&nbsp;<ins><font size=\"6\"> successful</font></ins></var></h1>\n" + "\t<p align=\"center\"><img alt=\"\" height=\"200\" src=\"https://pp.userapi.com/c416621/v416621007/67c6/MG6OKCXsZk4.jpg\" width=\"200\"></p>\n" + "\t<p align=\"center\">&nbsp;</p>\n" + "</form>\n" + "<p align=\"center\">&nbsp;</p>\n" + "</form></p>\n" + "</html>\n");
         }
    }

}
