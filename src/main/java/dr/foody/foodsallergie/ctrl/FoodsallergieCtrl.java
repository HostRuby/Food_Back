package dr.foody.foodsallergie.ctrl;

import dr.foody.foodsallergie.dto.FoodsallergieDto;
import dr.foody.foodsallergie.svc.FoodsallergieSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foodsallergie")
public class FoodsallergieCtrl {
    @Autowired
    FoodsallergieSvc foodsallergieService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute FoodsallergieDto foodsallergieDto){
        return foodsallergieService.getList(foodsallergieDto);
    }
    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute FoodsallergieDto foodsallergieDto){
        return foodsallergieService.regist(foodsallergieDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute FoodsallergieDto foodsallergieDto){
        return foodsallergieService.modify(foodsallergieDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "food_idx", required = true) Integer food_idx){
        return foodsallergieService.delete(food_idx);
    }
}
