package dubbo.demo.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.demo.model.User;
import dubbo.demo.service.UserService;

import java.util.Date;

/**
 * 2018/10/31 16:32
 * 走路呼呼带风
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setName("朱大常");
        user.setCreateTime(new Date());
        return user;
    }
}
