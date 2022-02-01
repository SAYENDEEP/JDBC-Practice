

//Plan 
//1 java
//2 oop
//3 jdbc
//4 Spring
//Frontend-->express/servlat-->jdbc/sequelize-->db



import java.sql.*;




public class App{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/Persondb";
            String user="root";
            String password="Sayen@1999";

            Connection con= DriverManager.getConnection(url, user, password);
            // if(con.isClosed()){
            //     System.out.println("Connection Not created");
            // }else{
            //     System.out.println("Connection created");
            // }
            
            //SELECT QUERY
            // String query="SELECT * FROM Student1 WHERE emp_id=?";
       
            // PreparedStatement sys1= con.prepareStatement(query);
            // sys1.setInt(1,3);
            //INSERT QUERY

            // String query="INSERT INTO Student1(emp_id,name,dept,designation) VALUES (?,?,?,?)";
            // PreparedStatement sys2= con.prepareStatement(query);
            // sys2.setInt(1,25);
            // sys2.setString(2,"Zawad");
            // sys2.setString(3,"IT");
            // sys2.setString(4,"Developer");
            // sys2.executeUpdate();
            // con.close();

            // Update QUERY
            // String query="UPDATE Student1 set dept='CSE' WHERE emp_id=?";
            // PreparedStatement sys1= con.prepareStatement(query);
            // sys1.setInt(1, 25);
            // sys1.executeUpdate();
            // System.out.println("Successfully");

            // ResultSet set =sys1.executeQuery();
            // while(set.next()){
            //   int id=set.getInt(1);
            //   String name= set.getString(2);
            //   String dept=set.getString(3);
            //   String designation=set.getString(4);
            //   System.out.println("Id:"+id+"name:"+name+"dept:"+dept+"designation"+designation);
            // }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}