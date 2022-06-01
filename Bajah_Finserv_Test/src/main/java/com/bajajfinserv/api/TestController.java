package com.bajajfinserv.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	DataService ds;

	@PostMapping("/bfhl")
	public ResponseEntity<User> testAPI(@Validated @RequestBody Data inputData) {
		Data d = inputData;
		User user = ds.resposeData(d);
		if(user!=null)
		{
			user.setIs_success(true);
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
