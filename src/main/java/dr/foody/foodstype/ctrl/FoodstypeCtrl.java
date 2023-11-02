package dr.foody.foodstype.ctrl;

import dr.foody.foodstype.dto.FoodstypeDto;
import dr.foody.foodstype.svc.FoodstypeSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foodstype")
public class FoodstypeCtrl {
    @Autowired
    FoodstypeSvc foodstypeService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute FoodstypeDto foodstypeDto){
        return foodstypeService.getList(foodstypeDto);
    }
    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute FoodstypeDto foodstypeDto){
        return foodstypeService.regist(foodstypeDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute FoodstypeDto foodstypeDto){
        return foodstypeService.modify(foodstypeDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "food_idx", required = true) Integer food_idx){
        return foodstypeService.delete(food_idx);
    }
}
