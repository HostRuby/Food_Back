package dr.foody.foodsallergie.svc;

import dr.foody.foodsallergie.dao.FoodsallergieDao;
import dr.foody.foodsallergie.dto.FoodsallergieDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodsallergieSvc {
    @Autowired
    FoodsallergieDao foodsallergieDao;

    public Object getList(FoodsallergieDto foodsallergieDto){
        return foodsallergieDao.getList(foodsallergieDto);
    }

    public Object modify(FoodsallergieDto foodsallergieDto){
        return foodsallergieDao.mod(foodsallergieDto);
    }

    public Object regist(FoodsallergieDto foodsallergieDto){
        return foodsallergieDao.reg(foodsallergieDto);
    }

    public Object delete(Integer food_idx){
        return foodsallergieDao.del(food_idx);
    }
}
