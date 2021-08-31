package com.cesar.project.learnspringframework.sample.enterprise.flow.dataservice;

import java.util.List;

import org.springframework.stereotype.Component;

//Responsible of getting data from the database
@Component
public class DataService {
	public List<Integer> retrieveData() {
		return List.of(123, 145, 543, 62, 23);
	}
}