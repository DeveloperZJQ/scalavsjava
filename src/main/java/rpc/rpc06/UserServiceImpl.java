package rpc.rpc06;

import rpc.common.IUserService;
import rpc.entity.User;

/**
 * @author happy
 * @since 2022/8/28
 */
public class UserServiceImpl implements IUserService {
    @Override
    public User findUserById(Integer id) {
        return new User(id, "Bob");
    }
}