package io.cambridage.aiml.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topic")
	public String getAllTopics() {
		return "All Topics";
	}
	
	@RequestMapping("/topicjson")
	public List<Topic> getAllTopicsJson() {
		return Arrays.asList(
				new Topic("Spring", "Sring Boot", "Spring is a Java Framework")
				);
	}
}
