package com.ocp.assessment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assessment9 {
    public void stmt(Connection conn, int a) throws SQLException {
        Statement stmt = conn.createStatement(a, ResultSet.TYPE_SCROLL_INSENSITIVE);
    }
}
