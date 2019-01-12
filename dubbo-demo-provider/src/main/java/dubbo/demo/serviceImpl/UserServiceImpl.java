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

    private int i = 0;
    @Override
    public User getUserById(Integer id) {
        i++;
        int order= i;
        if (i<=2){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        User user = new User();
        user.setId(1);
        user.setName("朱大常");
        user.setCreateTime(new Date());
        System.out.println("i="+order+" "+user);
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
        this.i = id;
    }
}
