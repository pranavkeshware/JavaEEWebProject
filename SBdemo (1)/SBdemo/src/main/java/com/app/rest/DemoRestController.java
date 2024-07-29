
package com.app.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/time")
	public String getTime()
	{
		return "Time on Server"+LocalDateTime.now();
	}
}
