package com.example.demo;

	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/web")
	public class UserController {
		
		
	//	http://localhost:8080/web/user?name=pratap
		
		@GetMapping("/user")
		public String getUser(@RequestParam String name) {
		    return "User Name: " + name;
		}
		
		
	//	http://localhost:8080/web/user/pratap
		
		@GetMapping("/user/{name}")
		public String getUser1(@PathVariable String name) {
		    return "User Name: " + name;
		}	

	    @GetMapping("/date")
	    public String getDate() {
	        return "Today's Date: " + LocalDate.now();
	    }

	    @GetMapping("/time")
	    public String getTime() {
	        return "Current Time: " + LocalTime.now();
	    }

	    @GetMapping("/datetime")
	    public String getDateTime() {
	        return "Current Date & Time: " + LocalDateTime.now();
	    }

	    @GetMapping("/day")
	    public String getDay() {
	        return "Today is: " + LocalDate.now().getDayOfWeek();
	    }

	    @GetMapping("/month")
	    public String getMonth() {
	        return "Current Month: " + LocalDate.now().getMonth();
	    }

	    @GetMapping("/year")
	    public String getYear() {
	        return "Current Year: " + LocalDate.now().getYear();
	    }
	    
	    
	    @GetMapping("/all/{name}")
	    public Map<String, Object> all(@PathVariable String name) {

	        Map<String, Object> data = new LinkedHashMap<>();

	        data.put("date", getYear());
	        data.put("time", getMonth());
	        data.put("datetime", getDateTime());
	        data.put("user", getUser(name));

	        return data;
	    }
	  
	}

