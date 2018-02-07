package com.jdbc;

import java.sql.*;

/**
 * Created by wangji on 2018/1/11.
 * 数据库连接测试
 */
public class MySqlTest {
    // Class.forName(); 忘记写main方法

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 注册驱动，忘记Class for Name 怎么写
        Class.forName("com.mysql.jdbc.Driver");

        // 3. 连接字符串
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/db?";

        Connection conn = DriverManager.getConnection(url, username, password);

        // 4. sql执行方式1
        String sql1 = "select * from t_dict";
        Statement stmt = conn.createStatement();
        stmt.execute(sql1);

        // 5. sql执行方式2
        // 准备SQL
        String sql2 = "select * from t_user";
        PreparedStatement pstmt = conn.prepareStatement(sql2);
        // 执行SQL
        pstmt.execute();

    }

}
