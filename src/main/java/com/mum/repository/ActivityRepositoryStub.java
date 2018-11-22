package com.mum.repository;

import java.util.ArrayList;
import java.util.List;

import com.mum.model.Activity;
import com.mum.model.ActivitySearch;
import com.mum.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findByConstraints(ActivitySearch search) {

		//System.out.println(search.getDescriptions()+", "+search.getDurationFrom()+", "+search.getDurationTo());
		
		System.out.println(search.getDurationTo());
		System.out.println(search.getSearchType());
		
		List<Activity> activities=new ArrayList<Activity>();
		Activity activity1=new Activity();
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(60);
		
		activities.add(activity1);
		return activities;
	}
	
	@Override
	public List<Activity> findByDescription(List<String> descriptions,int durationFrom,int durationTo) {
		
		List<Activity> activities=new ArrayList<Activity>();
		Activity activity1=new Activity();
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(60);
		
		activities.add(activity1);
		return activities;
	}
	
	@Override
	public Activity update(Activity actitvity) {
		//do lots of functionality here
		return actitvity;
	}
	
	@Override
	public void create(Activity activity) {
		
		
	}
	
	@Override
	public List<Activity> findAllActivities(){
		List<Activity> activities =new ArrayList<Activity>();
		
		Activity activity1=new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2=new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		// TODO Auto-generated method stub
		if(activityId.equals("7777")) {
			return null;
		}
		
		Activity activity1=new Activity();
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		User user =new User();
		user.setId("5678");
		user.setName("Behailu");
		
		activity1.setUser(user);
		
		return activity1;
	}

	@Override
	public void delete(String activityId) {
		
	}

}
