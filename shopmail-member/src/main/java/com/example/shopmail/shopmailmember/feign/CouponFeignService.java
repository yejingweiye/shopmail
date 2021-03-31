package com.example.shopmail.shopmailmember.feign;

import com.example.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("shopmail-coupon") //表示远程调用的服务名
public interface CouponFeignService {

    //下面两行是直接复制couponController的接口
    @RequestMapping("/shopmailcoupon/coupon/member/list") //这个路径要写全
    public R membercoupons();
}
