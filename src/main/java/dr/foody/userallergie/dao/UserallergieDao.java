package dr.foody.userallergie.dao;

import dr.foody.userallergie.dto.UserallergieDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserallergieDao {
    List<UserallergieDao> getList(UserallergieDto userallergieDto);
    Integer mod(UserallergieDto userallergieDto);
    Integer reg(UserallergieDto userallergieDto);
    Integer del(Integer user_idx);
}
