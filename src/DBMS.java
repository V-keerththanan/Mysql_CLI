import java.sql.*;

public class DBMS {
    Connection connect;
    DBMS() {
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorHack","root","Google@6773");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertData(String nic,String fname,String lname,String mobnum,String passw){

        String query="INSERT INTO userDetails values(?,?,?,?,?)";
        PreparedStatement pstatement= null;
        try {
            pstatement = this.connect.prepareStatement(query);
            pstatement.setString(1,nic);
            pstatement.setString(2,fname);
            pstatement.setString(3,lname);
            pstatement.setString(4,mobnum);
            pstatement.setString(5,passw);
            pstatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
