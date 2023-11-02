package dr.foody.foodscategory.svc;

import dr.foody.foodscategory.dao.FoodscategoryDao;
import dr.foody.foodscategory.dto.FoodscategoryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class FoodscategorySvc {
    @Autowired
    FoodscategoryDao foodscategoryDao;

    public Object getList(FoodscategoryDto foodscategoryDto){
        return foodscategoryDao.getList(foodscategoryDto);
    }

    public Object modify(FoodscategoryDto foodscategoryDto){
        return foodscategoryDao.mod(foodscategoryDto);
    }

    public Object regist(FoodscategoryDto foodscategoryDto){
        return foodscategoryDao.reg(foodscategoryDto);
    }

    public Object delete(Integer food_idx){
        return foodscategoryDao.del(food_idx);
    }
}
