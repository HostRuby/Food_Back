package dr.foody.foodsillness.ctrl;

import dr.foody.foodsillness.dto.FoodsillnessDto;
import dr.foody.foodsillness.svc.FoodsillnessSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foodsillness")
public class FoodsillnessCtrl {
    @Autowired
    FoodsillnessSvc foodsillnessService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute FoodsillnessDto foodsillnessDto){
        return foodsillnessService.getList(foodsillnessDto);
    }
    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute FoodsillnessDto foodsillnessDto){
        return foodsillnessService.regist(foodsillnessDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute FoodsillnessDto foodsillnessDto){
        return foodsillnessService.modify(foodsillnessDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "food_idx", required = true) Integer food_idx){
        return foodsillnessService.delete(food_idx);
    }
}
