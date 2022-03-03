package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(

				new Topic("Spring", "Spring FrameWork", "Spring Framework Description"),
				new Topic("Spring", "Spring FrameWork", "Spring Framework Description"),
				new Topic("Spring", "Spring FrameWork", "Spring Framework Description"));
	}

}
