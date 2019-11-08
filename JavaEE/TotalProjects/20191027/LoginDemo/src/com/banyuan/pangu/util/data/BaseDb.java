package com.banyuan.pangu.util.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author edz
 */
public class BaseDb {

    Conn conn = new Conn();

    public List queryData(String sql, Object... args) {
        Connection connection = null;
        connection = conn.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        List list = new ArrayList();

        try {
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("id"));
                list.add(rs.getString("userName"));
                list.add(rs.getString("userPassword"));
                list.add(rs.getString("userSmallName"));
                list.add(rs.getString("PhoneNum"));
                list.add(rs.getString("score"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.dbClose(connection, ps, rs);
        }

        return list;
    }

    public Vector queryDataScore(String sql, Object... args) {
        Vector data = new Vector();
        Connection connection = null;
        connection = conn.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                Vector line = new Vector();
                line.add(rs.getString("id"));
                line.add(rs.getString("name"));
                line.add(rs.getString("score"));
                line.add(rs.getString("totalScore"));
                line.add(rs.getString("GMT_Modify"));
                data.add(line);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.dbClose(connection, ps, rs);
        }

        return data;
    }


    public void modifyData(String sql, Object... args) {
        Connection connection = null;
        connection = conn.getConnection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.dbClose(connection, ps, null);
        }


    }


}