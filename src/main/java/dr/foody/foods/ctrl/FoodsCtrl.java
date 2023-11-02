package dr.foody.foods.ctrl;

import dr.foody.foods.dto.FoodsDto;
import dr.foody.foods.svc.FoodsSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foods")
public class FoodsCtrl {
    @Autowired
    FoodsSvc foodsService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute FoodsDto foodsDto){
        return foodsService.getList(foodsDto);
    }
    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute FoodsDto foodsDto){
        return foodsService.regist(foodsDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute FoodsDto foodsDto){
        return foodsService.modify(foodsDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "food_idx", required = true) Integer food_idx){
        return foodsService.delete(food_idx);
    }
}
