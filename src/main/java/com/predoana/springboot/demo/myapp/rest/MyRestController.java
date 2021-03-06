package com.predoana.springboot.demo.myapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	//inject properties for: coach.name and team.name

	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	//expose a new endpoint for "teaminfo"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name: " + teamName;
	}


	// "/" return "Hello World!"
	@GetMapping
	public String sayHello() {
		return "Hello World! " + LocalDateTime.now();
	}
	
	// expose a new endopint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "When nothing goes right, go run! ";
	}
	
	//expose a new endpoint for "fortune"
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Luck is not chance, it's toil... fortune's expensive smile is earned! ";
	}

}
