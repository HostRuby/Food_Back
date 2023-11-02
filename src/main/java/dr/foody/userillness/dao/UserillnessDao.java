package dr.foody.userillness.dao;

import dr.foody.userillness.dto.UserillnessDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserillnessDao {
        List<UserillnessDao> getList(UserillnessDto userillnessDto);
        Integer mod(UserillnessDto userillnessDto);
        Integer reg(UserillnessDto userillnessDto);
        Integer del(Integer user_idx);

}
