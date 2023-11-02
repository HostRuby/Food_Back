package dr.foody.foodstype.dao;

import dr.foody.foodstype.dto.FoodstypeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodstypeDao {
    List<FoodstypeDao> getList(FoodstypeDto foodstypeDto);
    Integer mod(FoodstypeDto foodstypeDto);
    Integer reg(FoodstypeDto foodstypeDto);
    Integer del(Integer food_idx);
}
