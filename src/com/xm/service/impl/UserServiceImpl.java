package com.xm.service.impl;

import com.xm.dao.UserDao;
import com.xm.dao.impl.UserDaoImpl;
import com.xm.pojo.User;
import com.xm.service.UserService;

/**
 * @author mintFM
 * @create 2021-09-24 9:53
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        /**
         * 咱们的登录，只是需要查询数据库即可！！！
         *
         * QQ登录 ！！！
         * 1、查询用户名和密码
         * 2、查询天气信息
         * 3、查询QQ邮箱几封未读邮件
         * 4、查询QQ空间留言数
         * 5、还要查询QQ游戏 有没有什么更新
         * 6、查询QQ的黄钻，什么什么钻，的皮肤信息。
         * 7、还要查询个个好友的登录IP和登录位置信息
         * 8、发QQ好友登录提示音
         */
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {

        if (userDao.queryUserByUsername(username) == null) {
            // 等于null,说明没查到，没查到表示可用
            return false;
        }

        return true;

    }
}

