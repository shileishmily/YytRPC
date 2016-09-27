package com.yyt.print.user.service.impl;

import com.yyt.print.user.pojo.UserThirdBind;
import com.yyt.print.user.service.IUserThirdBindService;
import org.springframework.stereotype.Service;

/**
 * Created by SomeBody on 2016/9/27.
 */
@Service("userThirdBindService")
public class UserThirdBindService implements IUserThirdBindService {
    @Override
    public int saveUserThirdBind(UserThirdBind thirdBind) {
        return 0;
    }

    @Override
    public UserThirdBind getUserThirdBind(String thirdId, int type) {
        return null;
    }
}
