package dr.foody.userallergie.ctrl;

import dr.foody.userallergie.dto.UserallergieDto;
import dr.foody.userallergie.svc.UserallergieSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userallergie")
public class UserallergieCtrl {
    @Autowired
    UserallergieSvc userallergieService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute UserallergieDto userallergieDto){
        return userallergieService.getList(userallergieDto);
    }

    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute UserallergieDto userallergieDto){
        return userallergieService.regist(userallergieDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute UserallergieDto userallergieDto){
        return userallergieService.modify(userallergieDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "user_idx", required = true) Integer user_idx){
        return userallergieService.delete(user_idx);
    }
}
