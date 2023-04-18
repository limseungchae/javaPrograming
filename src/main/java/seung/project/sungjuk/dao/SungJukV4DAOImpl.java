package seung.project.sungjuk.dao;

import seung.project.sungjuk.model.SungJukVO;

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
        return null;
    }

    @Override
    public SungJukVO selectOneSungJuk(int sjno) {
        return null;
    }

    @Override
    public int updateSungJuk(SungJukVO sj) {
        return 0;
    }

    @Override
    public int deleteSungJuk(int sjno) {
        return 0;
    }
}
