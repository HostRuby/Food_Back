package dr.foody.userillness.svc;

import dr.foody.userillness.dao.UserillnessDao;
import dr.foody.userillness.dto.UserillnessDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserillnessSvc {
    @Autowired
    UserillnessDao userillnessDao;

    public Object getList(UserillnessDto userillnessDto){
        return userillnessDao.getList(userillnessDto);
    }

    public Object modify(UserillnessDto userillnessDto){
        return userillnessDao.mod(userillnessDto);
    }

    public Object regist(UserillnessDto userillnessDto){
        return userillnessDao.reg(userillnessDto);
    }

    public Object delete(Integer user_idx){
        return userillnessDao.del(user_idx);
    }

}
