package com.banyuan.pangu.util.data;

import java.sql.*;

/**
 * @author edz
 */
public class Conn {

        public  Connection getConnection() {
            Connection connection = null;
            try {

                String url = "jdbc:mysql://localhost:3306/zcj";

                String userName = "root";

                String password = "Root_123";

                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, userName, password);

            }
            catch (ClassNotFoundException e) {

                e.printStackTrace();
            }
            catch (SQLException e) {

                e.printStackTrace();
            }
            return connection;

        }
    public void dbClose(Connection conn, PreparedStatement ps, ResultSet rs) {

        if (rs != null) {
            try {
                rs.close();
            }
            catch (SQLException e) {

                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            }
            catch (SQLException e) {

                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


}
