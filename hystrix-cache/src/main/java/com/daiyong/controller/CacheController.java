package com.daiyong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daiyong on 2017/6/29.
 * email daiyong@coohua.com
 */
@RestController
public class CacheController {

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	@RequestMapping("/change/product")
	public String changeProduct(Long productId) {
		return "success";
	}

}
