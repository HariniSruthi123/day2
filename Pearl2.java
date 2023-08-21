package com.problem.springday14;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pearl2 {
@Value("${var}")
private String name;
@GetMapping("name")
public String display()
{
	return "Hi Everyone ,I am"+name;
}


}
	
	
