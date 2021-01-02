package io.cambridage.aiml.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	// Get - Testing API.
	@RequestMapping("/topic")
	public String getAllTopics() {
		return "All Topics";
	}
	
	// Get - Topics (using Services).
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topicjson")
	public List<Topic> getAllTopicsJson() {
		
		return topicService.getAllTopics();
	}

	// Get - Topic ID (using Services).	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
		
	}
}
