package com.prabu.settigbyprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SettingByProfileController {

	@Value("${spring.datasource.url}")
	public String dbUrl;
	
	@RequestMapping("/setting")
	@ResponseBody
	public String settings()
	{
		return dbUrl;
	}
}
