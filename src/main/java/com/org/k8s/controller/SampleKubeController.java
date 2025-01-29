package com.org.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleKubeController
{
	@GetMapping("/message")
	public String welcome()
	{
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}
}
