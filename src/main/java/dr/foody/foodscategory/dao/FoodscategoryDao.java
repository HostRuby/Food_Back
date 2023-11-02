package dr.foody.foodscategory.dao;

import dr.foody.foodscategory.dto.FoodscategoryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodscategoryDao {
    List<FoodscategoryDao> getList(FoodscategoryDto foodscategoryDto);
    Integer mod(FoodscategoryDto foodscategoryDto);
    Integer reg(FoodscategoryDto foodscategoryDto);
    Integer del(Integer food_idx);
}
