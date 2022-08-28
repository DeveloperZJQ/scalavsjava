package rpc.common;

import rpc.entity.User;

/**
 * @author happy
 * @since 2022/8/28
 */
public interface IUserService {
    User findUserById(Integer id);
}
