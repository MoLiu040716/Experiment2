package ynu.edu.controller;

import org.springframework.web.bind.annotation.*;
import ynu.edu.entity.CommonResult;
import ynu.edu.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "success(11000)";
        try {
            User user = new User(userId, "zjh", "123");
            result.setResult(user);

        }catch (Exception e){
            code=500;
            message="failed";
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    @PostMapping("/postUserById/{userId}")
    public CommonResult<User> postUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "用户提交成功success(11000)";
        try {
            User user = new User(userId, "zjh", "123");
            result.setResult(user);

        }catch (Exception e){
            code=500;
            message="failed";
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    @PutMapping("/putUserById/{userId}")
    public CommonResult<User> putUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "用户提交成功success(11000)";
        try {
            User user = new User(userId, "zjh", "123");
            result.setResult(user);

        }catch (Exception e){
            code=500;
            message="failed";
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    @DeleteMapping("/deleteUserById/{userId}")
    public CommonResult<User> deleteUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = new CommonResult<>();
        Integer code = 200;
        String message = "用户删除成功success(11000)";
        try {
            User user = new User(userId, "zjh", "123");
            result.setResult(user);

        }catch (Exception e){
            code=500;
            message="failed";
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }



}
