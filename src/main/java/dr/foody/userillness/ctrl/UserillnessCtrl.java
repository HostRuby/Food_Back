package dr.foody.userillness.ctrl;

import dr.foody.userillness.dto.UserillnessDto;
import dr.foody.userillness.svc.UserillnessSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userillness")
public class UserillnessCtrl {
    @Autowired
    UserillnessSvc userillnessService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute UserillnessDto userillnessDto){
        return userillnessService.getList(userillnessDto);
    }

    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute UserillnessDto userillnessDto){
        return userillnessService.regist(userillnessDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute UserillnessDto userillnessDto){
        return userillnessService.modify(userillnessDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "user_idx", required = true) Integer user_idx){
        return userillnessService.delete(user_idx);
    }
}
