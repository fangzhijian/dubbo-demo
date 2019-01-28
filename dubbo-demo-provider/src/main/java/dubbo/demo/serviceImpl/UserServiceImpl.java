package dubbo.demo.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.demo.model.User;
import dubbo.demo.service.UserService;

import java.util.Date;

/**
 * 2018/10/31 16:32
 * 走路呼呼带风
 */
@Service(version = "6.66")
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setName("朱大常");
        user.setCreateTime(new Date());
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println(23e24);
    }

    @Override
    public String getUserName() {
        return "你好我叫猪大肠";
    }
}
