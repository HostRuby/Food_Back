package dr.foody.userallergie.svc;

import dr.foody.userallergie.dao.UserallergieDao;
import dr.foody.userallergie.dto.UserallergieDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserallergieSvc {
    @Autowired
    UserallergieDao userallergieDao;

    public Object getList(UserallergieDto userallergieDto){
        return userallergieDao.getList(userallergieDto);
    }

    public Object modify(UserallergieDto userallergieDto){
        return userallergieDao.mod(userallergieDto);
    }

    public Object regist(UserallergieDto userallergieDto){
        return userallergieDao.reg(userallergieDto);
    }

    public Object delete(Integer user_idx){
        return userallergieDao.del(user_idx);
    }
}
