package com.shopcart.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shopcart.orderservice.dto.CartDto;

@FeignClient(name = "CARTSERVICE", url = "http://localhost:8033")
public interface CartFeignClient {

    @GetMapping("/cart/{cartId}")
    CartDto getCartById(@PathVariable Long cartId);
}
