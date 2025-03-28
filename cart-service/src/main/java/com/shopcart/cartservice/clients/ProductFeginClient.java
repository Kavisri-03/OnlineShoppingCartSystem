package com.shopcart.cartservice.clients;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shopcart.cartservice.dto.ProductDto;


@FeignClient(name = "PRODUCTSERVICE")
public interface ProductFeginClient {
	@GetMapping("/product/{id}")
	ProductDto getProductById(@PathVariable Long id);

}