package Practice;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbc {
    public static void main(String[] args) throws Exception {

        // Load driver
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521", "mef190570107138",
                    "mef190570107153");
            Statement st = (Statement) con.createStatement();
            ResultSet rs = ((java.sql.Statement) st).executeQuery("select*from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            rs.close();
            ((Connection) st).close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
