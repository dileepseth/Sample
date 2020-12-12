package com.example.demo;

import com.example.demo.face.TimeClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class TimeClockController {

   @Autowired
   private TimeClockService timeClockService;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/getAngle/{time}")
	public int getAngles(@PathVariable("time") String time){
		return timeClockService.getAngle(time);
	}




}
