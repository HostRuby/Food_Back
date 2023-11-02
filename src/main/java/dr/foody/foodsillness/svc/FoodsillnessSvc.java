package dr.foody.foodsillness.svc;

import dr.foody.foodsillness.dao.FoodsillnessDao;
import dr.foody.foodsillness.dto.FoodsillnessDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodsillnessSvc {
    @Autowired
    FoodsillnessDao foodsillnessDao;

    public Object getList(FoodsillnessDto foodsillnessDto){
        return foodsillnessDao.getList(foodsillnessDto);
    }

    public Object modify(FoodsillnessDto foodsillnessDto){
        return foodsillnessDao.mod(foodsillnessDto);
    }

    public Object regist(FoodsillnessDto foodsillnessDto){
        return foodsillnessDao.reg(foodsillnessDto);
    }

    public Object delete(Integer food_idx){
        return foodsillnessDao.del(food_idx);
    }
}
