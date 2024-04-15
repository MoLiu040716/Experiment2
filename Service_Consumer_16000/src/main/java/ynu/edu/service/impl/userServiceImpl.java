//package ynu.edu.service.impl;
//
//import jakarta.annotation.Resource;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.client.RestTemplate;
//import ynu.edu.entity.CommonResult;
//import ynu.edu.entity.User;
//import ynu.edu.service.userService;
//
//@Service
//public class userServiceImpl implements userService {
//    @Resource
//    private RestTemplate restTemplate;
//    @Override
//    public CommonResult<User> getCartById( Integer userId) {
//        CommonResult<User> result = restTemplate.getForObject(
//                "http://localhost:11000/user/getUserById/" + userId.toString(), CommonResult.class);
//        return result;
//    }
//}
