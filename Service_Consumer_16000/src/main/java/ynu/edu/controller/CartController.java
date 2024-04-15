package ynu.edu.controller;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import ynu.edu.entity.CommonResult;
import ynu.edu.entity.User;
import ynu.edu.feign.ServiceProviderService;




@RestController
@RequestMapping("/cart")
public class CartController {

    @Resource
    private ServiceProviderService serviceProviderService;
    @GetMapping("/getCartById/{userId}")
    public CommonResult<User> getCartById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = serviceProviderService.getUserById(userId);
        return result;
    }

    @PostMapping("/postCartById/{userId}")
    public CommonResult<User> postCartById(@PathVariable("userId") Integer userId){

        CommonResult<User> result = serviceProviderService.postUserById(userId);
        return result;
    }

    @PutMapping("/putCartById/{userId}")
    public CommonResult<User> putCartById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = serviceProviderService.putUserById(userId);
        return result;
    }

    @DeleteMapping("/deleteCartById/{userId}")
    public CommonResult<User> deleteCartById(@PathVariable("userId") Integer userId){
        CommonResult<User> result = serviceProviderService.deleteUserById(userId);
        return result;
    }
}
