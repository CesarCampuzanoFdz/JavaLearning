package com.cesar.project.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cesar.project.learnspringframework.sample.enterprise.flow.dataservice.DataService;

//Responsible of Business Logic
@Component
public class BusinessService {
	@Autowired
	private DataService datService;

	public long getSum() {
		List<Integer> data = datService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}

}
