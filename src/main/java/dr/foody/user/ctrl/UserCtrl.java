package dr.foody.user.ctrl;

import dr.foody.user.dto.UserDto;
import dr.foody.user.svc.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserCtrl {
    @Autowired
    UserSvc userService;

    @GetMapping("/getList")
    public Object getInsDevList(@ModelAttribute UserDto userDto){
        return userService.getList(userDto);
    }

    @PostMapping("/regist")
    public Object regInsDev(@ModelAttribute UserDto userDto){
        return userService.regist(userDto);
    }

    @PutMapping("/update")
    public Object modInsDev(@ModelAttribute UserDto userDto){
        return userService.modify(userDto);
    }

    @DeleteMapping("/delete")
    public Object delInsDev(@RequestParam(value = "user_idx", required = true) Integer user_idx){
        return userService.delete(user_idx);
    }
}
