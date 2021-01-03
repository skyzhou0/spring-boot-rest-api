package io.cambridage.aiml.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Sring Boot", "Spring is a Java Framework"),
			new Topic("Java", "Java EE", "Java EE Framework")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void appTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i,  topic);
				return;
			}
		}
	}
	
	public Topic deleteTopic(String id) {
		Topic record = topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		topics.removeIf(t -> t.getId().equals(id));
		return record;
		
	}
}
