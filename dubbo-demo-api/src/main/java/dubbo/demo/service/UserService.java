package dubbo.demo.service;

import dubbo.demo.model.User;

/**
 * 2018/10/31 16:30
 * 走路呼呼带风
 */
public interface UserService {

    User getUserById(Integer id);

    void deleteUser(Integer id);
}
