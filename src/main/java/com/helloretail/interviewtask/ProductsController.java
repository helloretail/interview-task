package com.helloretail.interviewtask;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductsController {
	
	@RequestMapping("/products")
	public Map<String, String> get() {
		return new HashMap<String, String>(){{
			put("message", "Hello World from the API");
		}};
	}

}