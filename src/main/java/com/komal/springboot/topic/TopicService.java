package com.komal.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics= new ArrayList<> (Arrays.asList(
					new Topic("spring","Spring Framework","This is Spring desc.."),
					new Topic("java","core java","This is java desc.."),
					new Topic("javascript","javascript","This is javascript desc..")
					));
	
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}

	

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0; i<topics.size(); i++) {
			Topic t= topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}
	}

	
	
}
