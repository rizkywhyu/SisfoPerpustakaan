/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfo.perpustakaan;

import java.sql.*;

public class database {

    private Statement stat;
    private Connection conn;
    private ResultSet rs;

    public database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
            stat = conn.createStatement();
        } catch (Exception e) {
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stat.executeQuery(SQLString);
        } catch (Exception e) {
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stat.executeUpdate(SQLString);
        } catch (Exception e) {
        }
    }
}
