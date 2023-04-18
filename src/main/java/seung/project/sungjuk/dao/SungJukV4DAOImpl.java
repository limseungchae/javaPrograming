package seung.project.sungjuk.dao;

import seung.project.sungjuk.SungJukV4Main;
import seung.project.sungjuk.model.SungJukVO;
import sun.security.provider.Sun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SungJukV4DAOImpl implements SungJukV4DAO{
    private String insertSQL = " inert into sungjuk (name,kor,eng,mat,tot,avg,grd) values (?,?,?,?,?,?,?)";
    private String selectSQL = " select sjno,name,kor,eng,mat from sungjk order by sjno ";
    private String selectOneSQL = " select * from sungjuk where sjno = ? ";
    private String updateSQL = " update sungjuk set name = ?, kor = ?, eng = ?, mat = ? where sjno = ? ";
    private String deleteSQL = " delete from sungjuk where sjno = ? ";


    public SungJukV4DAOImpl() {
    }

    @Override
    public int insertSungJuk(SungJukVO sj) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int cnt = -1;

        try {
            conn = MariaDB.makeConn();
            pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1,sj.getName());
            pstmt.setInt(2,sj.getKor());
            pstmt.setInt(3,sj.getEng());
            pstmt.setInt(4,sj.getEng());
            pstmt.setInt(5,sj.getMat());
            pstmt.setInt(6,sj.getTot());
            pstmt.setDouble(7,sj.getAvg());
            pstmt.setString(8,sj.getGrd()+"");

            cnt = pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println("insertSungJuk에서 오류발생!!");
            ex.printStackTrace();   // 예외의 자세한 내용 출력
        } finally {
            MariaDB.closeConn(null,pstmt,conn);
        }

        return cnt;
    }

    @Override
    public List<SungJukVO> selectSungJuk() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<SungJukVO> sjdata = new ArrayList<>();

        try {
            conn = MariaDB.makeConn();
            pstmt = conn.prepareStatement(selectSQL);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                SungJukVO sj = new SungJukVO(rs.getString(2),
                        rs.getInt(3), rs.getInt(4),
                        rs.getInt(5));
                sj.setSjno(rs.getInt(1));
                sjdata.add(sj);
            }

        } catch (Exception ex) {
            System.out.println("selectSungJuk에서 오류발생!!");
            ex.printStackTrace();   // 예외의 자세한 내용 출력
        } finally {
            MariaDB.closeConn(null,pstmt,conn);
        }

        return null;
    }

    @Override
    public SungJukVO selectOneSungJuk(int sjno) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        SungJukVO sj = null;

        try {
            conn = MariaDB.makeConn();
            pstmt = conn.prepareStatement(selectOneSQL);
            pstmt.setInt(1, sjno);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                sj = new SungJukVO(rs.getString(2),
                        rs.getInt(3),rs.getInt(4),
                        rs.getInt(5),rs.getInt(6),
                        rs.getDouble(7),rs.getString(8).charAt(0));
                sj.setSjno(rs.getInt(1));
                sj.setRegdate(rs.getString(9));
            }
        } catch (Exception ex) {
            System.out.println("selectSungJuk에서 오류발생!!");
            ex.printStackTrace();   // 예외의 자세한 내용 출력
        } finally {
            MariaDB.closeConn(null,pstmt,conn);
        }

        return sj;
    }
    @Override
    public int updateSungJuk(SungJukVO sj) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = MariaDB.makeConn();
        } catch (Exception ex) {
            System.out.println("updateSungJuk에서 오류발생!!");
            ex.printStackTrace();   // 예외의 자세한 내용 출력
        } finally {
            MariaDB.closeConn(null,pstmt,conn);
        }

        return 0;
    }
    @Override
    public int deleteSungJuk(int sjno) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int cnt = -1;

        try {
            conn = MariaDB.makeConn();
            pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setInt(1,sjno);

            cnt = pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.println("deleteSungJuk에서 오류발생!!");
            ex.printStackTrace();   // 예외의 자세한 내용 출력
        } finally {
            MariaDB.closeConn(null,pstmt,conn);
        }

        return cnt;
    }
}
