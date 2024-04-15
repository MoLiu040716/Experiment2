package ynu.edu.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ynu.edu.entity.CommonResult;
import ynu.edu.entity.User;

@FeignClient("provider-server")
public interface ServiceProviderService {
    @GetMapping("/user/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId);
    @PostMapping("/user/postUserById/{userId}")
    public CommonResult<User> postUserById(@PathVariable("userId") Integer userId);
    @PutMapping("/user/putUserById/{userId}")
    public CommonResult<User> putUserById(@PathVariable("userId") Integer userId);
    @DeleteMapping("/user/deleteUserById/{userId}")
    public CommonResult<User> deleteUserById(@PathVariable("userId") Integer userId);
}
