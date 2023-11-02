package dr.foody.foodsillness.dao;

import dr.foody.foodsillness.dto.FoodsillnessDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodsillnessDao {
    List<FoodsillnessDao> getList(FoodsillnessDto foodsillnessDto);
    Integer mod(FoodsillnessDto foodsillnessDto);
    Integer reg(FoodsillnessDto foodsillnessDto);
    Integer del(Integer food_idx);
}
