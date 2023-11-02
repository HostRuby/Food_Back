package dr.foody.foods.dao;

import dr.foody.foods.dto.FoodsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodsDao {
    List<FoodsDao> getList(FoodsDto foodsDto);
    Integer mod(FoodsDto foodsDto);
    Integer reg(FoodsDto foodsDto);
    Integer del(Integer food_idx);
}
