package com.mycompany.program.sayal.task18withjdbc.dbconnection;

import com.mycompany.program.sayal.task18withjdbc.constant.DbConstant;

import java.sql.*;

/**
 *
 * @author User
 */
public class DbConnection {

    private Connection conn =null;
    private PreparedStatement stmt = null;

    public PreparedStatement initStatement(String sql) throws SQLException {
        stmt = conn.prepareStatement(sql);
        return stmt;
    }

    public void open() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost/ArticleAuthor", "postgres", "admin");
    }

    public int executeUpdate() throws SQLException {
        return stmt.executeUpdate();
    }

    public ResultSet executeQuery() throws SQLException {
        return stmt.executeQuery();
    }

    public void close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            conn = null;
        }

    }
}
