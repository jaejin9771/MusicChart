/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicchart.controller;

import com.mycompany.musicchart.model.Chart;
import java.sql.*;
import java.time.LocalTime;

/**
 *
 * @author 재진
 */
public class DBCon {

    final String driver = "org.mariadb.jdbc.Driver";
    final String DB_IP = "113.198.236.99";
    final String DB_PORT = "9090";
    final String DB_NAME = "chartdb";
    final String DB_URL = "jdbc:mariadb://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
    int ROW = 50, COL = 3;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Statement stmt = null;

    public DBCon() {

    }

    public void connect() { //드라이버랑 연결
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(DB_URL, "root", "9771");
            if (conn != null) {
                System.out.println("DB 접속 성공");
            }
            System.out.println("connect : " + conn);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 접속 실패");
            e.printStackTrace();

        }
    }

    public void dbInput(Chart rk, String table) { // 테이블에 차트 목록 넣기

        System.out.println("conn : " + conn);

        for (int i = 0; i < ROW; i++) {
            try {

                String sql = "INSERT INTO " + table + "(rank, songName, artistName) VALUES (?,?,?) ";

                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, i + 1);
                pstmt.setString(2, rk.getListTitle().get(i));
                pstmt.setString(3, rk.getListName().get(i));

                System.out.println("넘어옴");

                // SQL insert 쿼리 db에 전송
                int count = pstmt.executeUpdate();

                if (count == 0) {
                    System.out.println("데이터값에 이상이 있습니다.");
                } else {
                    System.out.println("데이터 Insert 성공!");
                }

            } catch (SQLException sQLException) {
                System.out.println(sQLException);
            }
        }
    }

    public void dbDelete(String table) {
        try {
            String sql = "delete from " + table;

            pstmt = conn.prepareStatement(sql);

            int count = pstmt.executeUpdate();

            if (count == 0) {
                System.out.println("삭제가 되지 않았습니다.");
            } else {
                System.out.println(table + " 데이터 삭제 성공!");
            }
        } catch (SQLException e) {
            System.out.println("데이터 삭제 오류: " + e);
        }

    }

    public void dbUpdate(Chart rk, String table) {
        LocalTime now = LocalTime.now();

        if (now.getHour() == 6 && now.getMinute() == 0 && now.getSecond() == 0) {

            dbDelete(table);
            dbInput(rk, table);
        }
    }

    public Object[][] getData(Object[][] rowData, String table) {
        try {
            String sql = "select * from " + table;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            for (int i = 0; i < rowData.length; i++) {
                rs.next();
                int colnum = 0;
                rowData[i][colnum] = i + 1;
                rowData[i][++colnum] = rs.getString("songName");
                rowData[i][++colnum] = rs.getString("artistName");
            }
            System.out.println("데이터 가져오기 성공!");
            rs.close();
        } catch (SQLException e) {
            System.out.println("데이터 가져오기 오류 : " + e);
        }

        return rowData;
    }

    public Object[][] ascData(Object[][] rowData, String table, String col) {
        try {

            String sql = "select * from "+table +" order by "+ col + " asc";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            for (int i = 0; i < rowData.length; i++) {
                rs.next();
                int colnum = 0;
                rowData[i][colnum] = i + 1;
                rowData[i][++colnum] = rs.getString("songName");
                rowData[i][++colnum] = rs.getString("artistName");
            }
            System.out.println("데이터 정렬 성공!");
            rs.close();
        } catch (SQLException e) {
            System.out.println("정렬 오류 :" + e);
        }
        return rowData;
    }

}
