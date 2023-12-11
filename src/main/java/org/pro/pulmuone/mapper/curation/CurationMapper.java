package org.pro.pulmuone.mapper.curation;

import java.sql.SQLException;
import java.util.List;

import org.pro.pulmuone.domain.curation.CurationVO;
import org.pro.pulmuone.domain.curation.KidsVO;

public interface CurationMapper {


   // 6. 맞춤 프로그램
   public List<CurationVO> CurationSel(CurationVO vo)  throws ClassNotFoundException, SQLException;

   // 7. 맞춤 상품
  //  public List<CurationVO> selectPD(String path, int program_no)  throws ClassNotFoundException, SQLException;
   
   // 8. 키즈 상품
   public List<KidsVO> kids()  throws ClassNotFoundException, SQLException;
   
   // 모달창
   public List<KidsVO> modal( KidsVO vo )  throws ClassNotFoundException, SQLException;

}
