package dr.foody.foodstype.svc;

import dr.foody.foodstype.dao.FoodstypeDao;
import dr.foody.foodstype.dto.FoodstypeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodstypeSvc {
    @Autowired
    FoodstypeDao foodstypeDao;

    public Object getList(FoodstypeDto foodstypeDto){
        return foodstypeDao.getList(foodstypeDto);
    }

    public Object modify(FoodstypeDto foodstypeDto){
        return foodstypeDao.mod(foodstypeDto);
    }

    public Object regist(FoodstypeDto foodstypeDto){
        return foodstypeDao.reg(foodstypeDto);
    }

    public Object delete(Integer food_idx){
        return foodstypeDao.del(food_idx);
    }
}
