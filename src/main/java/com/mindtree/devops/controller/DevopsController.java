package com.mindtree.devops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
private class DevopsController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String menu() {	
		return "menu";
	}
	@RequestMapping("/devops")
	private String devops()
	{
		return "devops";
	}
	@RequestMapping("/tools")
	private String tools()
	{
		return "tools";
	}
	@RequestMapping("/developer")
	private String developer()
	{
		return "developer";
	}
	@RequestMapping("/git")
	private String git()
	{
		return "git";
	}
	@RequestMapping("/jenkins")
	private String jenkins()
	{
		return "jenkins";
	}
	@RequestMapping("/maven")
	private String maven()
	{
		return "maven";
	}
	@RequestMapping("/sonarqube")
	private String sonarqube()
	{
		return "sonarqube";
	}
	@RequestMapping("/artifactory")
	private String artifactory()
	{
		return "artifactory";
	}
	@RequestMapping("/docker")
	private String docker()
	{
		return "docker";
	}
	@RequestMapping("/ansible")
	private String ansible()
	{
		return "ansible";
	}
	@RequestMapping("/terraform")
	private String terraform()
	{
		return "terraform";
	}
	
}
