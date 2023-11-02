package dr.foody.foodsallergie.dao;

import dr.foody.foodsallergie.dto.FoodsallergieDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodsallergieDao {
    List<FoodsallergieDto> getList(FoodsallergieDto foodsallergieDto);
    Integer mod(FoodsallergieDto foodsallergieDto);
    Integer reg(FoodsallergieDto foodsallergieDto);
    Integer del(Integer food_idx);
}
