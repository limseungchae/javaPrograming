package seung.project.sungjuk.dao;

import seung.project.sungjuk.model.SungJukVO;

import java.util.List;

public interface SungJukV3DAO {

    boolean saveSungJuk(SungJukVO sj);

    List<SungJukVO> lodSungJuk();

    void writeSungJuk(List<SungJukVO> sjs);
}
