package dr.foody.foods.svc;

import dr.foody.foods.dao.FoodsDao;
import dr.foody.foods.dto.FoodsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodsSvc {
    @Autowired
    FoodsDao foodsDao;

    public Object getList(FoodsDto foodsDto){
        return foodsDao.getList(foodsDto);
    }

    public Object modify(FoodsDto foodsDto){
        return foodsDao.mod(foodsDto);
    }

    public Object regist(FoodsDto foodsDto){
        return foodsDao.reg(foodsDto);
    }

    public Object delete(Integer food_idx){
        return foodsDao.del(food_idx);
    }
}
