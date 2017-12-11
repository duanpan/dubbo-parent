package cn.dp.service;

import cn.dp.Entity.User;
import cn.dp.api.UserApi;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/12/1.
 */
@Component
public class UserApiImpl implements UserApi {

    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName("张三");
        user.setSex("男");
        return user;
    }
}
