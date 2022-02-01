import java.sql.*;


public class App {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/Persondb";
        String uname="root";
        String pass="Sayen@1999";
        //Selecting using where clause
    //     String query="SELECT name from Student1 WHERE emp_id=5";
    //   Class.forName("com.mysql.jdbc.Driver");
    //   Connection con = DriverManager.getConnection(url, uname, pass);
    //   Statement st= con.createStatement();
    //    ResultSet rs=st.executeQuery(query);
    //    rs.next();
    //    String name= rs.getString("name");
    //    System.out.println(name);
    //    st.close();
    //    con.close();
    
    // String query="SELECT * from Student1";
    // Class.forName("com.mysql.jdbc.Driver");
    // Connection con = DriverManager.getConnection(url, uname, pass);
    // Statement st= con.createStatement();
    //  ResultSet rs=st.executeQuery(query);
    // //  String userData="";
    //  while(rs.next()){
    //  System.out.println(rs.getInt(1)+":"+rs.getString(2));
    //  }
    //  st.close();
    //  con.close();
    //Insert Into Table
    // String query="INSERT INTO Student1 VALUES(8,'Rupam','ECE','Full Stack Consultant')";
    //    Class.forName("com.mysql.jdbc.Driver");
    // Connection con = DriverManager.getConnection(url, uname, pass);
    // Statement st= con.createStatement();
    // int count =st.executeUpdate(query);
    // System.out.println(count +"row/s affected");
    //  st.close();
    //  con.close();


    }
}
