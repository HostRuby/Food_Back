package dr.foody.foodscategory.ctrl;

import dr.foody.foodscategory.dto.FoodscategoryDto;
import dr.foody.foodscategory.svc.FoodscategorySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foodscategory")
public class FoodscategoryCtrl {
    @Autowired
    FoodscategorySvc foodscategoryService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute FoodscategoryDto foodscategoryDto){
        return foodscategoryService.getList(foodscategoryDto);
    }
    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute FoodscategoryDto foodscategoryDto){
        return foodscategoryService.regist(foodscategoryDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute FoodscategoryDto foodscategoryDto){
        return foodscategoryService.modify(foodscategoryDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "food_idx", required = true) Integer food_idx){
        return foodscategoryService.delete(food_idx);
    }
}
