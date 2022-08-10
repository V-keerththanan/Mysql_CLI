import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBMS {
    Connection connect;

    DBMS() {
        try {
            this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorHack", "root", "root@1999");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertData(String nic, String fname, String lname, String mobnum, String passw) {

        String query = "INSERT INTO userDetails values(?,?,?,?,?)";
        PreparedStatement pstatement = null;
        try {
            pstatement = this.connect.prepareStatement(query);
            pstatement.setString(1, nic);
            pstatement.setString(2, fname);
            pstatement.setString(3, lname);
            pstatement.setString(4, mobnum);
            pstatement.setString(5, passw);
            pstatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public Map<String, String> getAllusernameAndpassword() {
        String query = "SELECT * FROM userDetails";
        Map<String, String> tempMap = new HashMap<>();
        try {
            Statement stat = connect.createStatement();
            ResultSet result = stat.executeQuery(query);
            while (result.next()) {
                tempMap.put(result.getString("NIC"), result.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tempMap;

    }

    public Map<String, ArrayList<String>> getAllDetails() {
        String query = "SELECT * FROM userDetails";

        Map<String, ArrayList<String>> tempMap = new HashMap<>();
        try {
            Statement stat = connect.createStatement();
            ResultSet result = stat.executeQuery(query);

            while (result.next()) {
                int i = 2;
                ArrayList<String> tempList = new ArrayList<>();
                while (i < result.getMetaData().getColumnCount()) {
                    tempList.add(result.getString(i));
                    i++;
                }
                tempMap.put(result.getString(1), tempList);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tempMap;

    }

}
