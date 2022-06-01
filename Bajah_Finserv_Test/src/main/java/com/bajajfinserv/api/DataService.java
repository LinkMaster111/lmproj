package com.bajajfinserv.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	public User resposeData(Data d)
	{
		String[] arr=d.getData();
		User user=new User();
		user.setUser_id("john_doe_17091999");
		user.setEmail("john@xyz.com");
		user.setRoll_number("ABCD123");
		List<String> str=new ArrayList<String>();
		List<Integer> num=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i].charAt(0)))
			{
				
				num.add(Integer.parseInt(arr[i]));
			}
			else
			{
				str.add(arr[i]);
			}
		}
		
		user.setAlphabetes(str);
		user.setNumbers(num);
		return user;
		
	}
	

}
