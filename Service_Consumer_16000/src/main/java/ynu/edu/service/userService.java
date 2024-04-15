package ynu.edu.service;

import ynu.edu.entity.CommonResult;
import ynu.edu.entity.User;

public interface userService {
    CommonResult<User> getCartById(Integer userId);
}
