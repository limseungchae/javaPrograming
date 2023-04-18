package seung.project.sungjuk.dao;

import seung.project.sungjuk.model.SungJukVO;

import java.util.List;

public interface SungJukV4DAO {

    int insertSungJuk(SungJukVO sj);

    List<SungJukVO> selectSungJuk();

    SungJukVO selectOneSungJuk(int sjno);

    int updateSungJuk(SungJukVO sj);

    int deleteSungJuk(int sjno);


}
