package seung;

import java.sql.*;
import java.util.Scanner;

public class J28JDBC {
    private static String DRV = "org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.cmsyuhhb6fnz.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";

    private static String selectBookSQL = "select = from newbooks order by bookno desc";

    public static void main(String[] args) {
        // newbooks 테이블의 모든 레코드 조회

        try {
            // 라이브러리 등록
            Class.forName(DRV);
        } catch (ClassNotFoundException e) {
            System.out.println("mariadb 용 JDBC 드라이버가 없어요!!");
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 데이터베이스 접속
            conn = DriverManager.getConnection(URL, USR, PWD);
            pstmt = conn.prepareStatement(selectBookSQL);

            // SQL문 실행 후 결과집합 받음
            rs = pstmt.executeQuery();    // DML 실행시 사용

            while (rs.next()) {
                System.out.println(rs.getInt("bookno") + " ");
                System.out.println(rs.getString("title") + " ");
                System.out.println(rs.getString("writer") + " \n");

            }


        } catch (SQLException e) {
            System.out.println("디비 접속주소나 아이디/비번을 확인하세요!!");
        } finally {
            if (rs != null) try { rs.close(); }catch (Exception ex) {}
            if (pstmt != null) try { pstmt.close(); }catch (Exception ex) {}
            if (conn != null) try { conn.close(); }catch (Exception ex) {}
        }

    }
}

class Book {
    private int bookno;
    private String title;
    private String author;
    private int price;
    private String regdate;

    public Book(int bookno, String title, String author, int price, String regdate) {
        this.bookno = bookno;
        this.title = title;
        this.author = author;
        this.price = price;
        this.regdate = regdate;
    }

    public int getBookno() {
        return bookno;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}
