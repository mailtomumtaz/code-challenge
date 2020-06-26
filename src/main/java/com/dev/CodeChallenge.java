package com.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodeChallenge {

	public List<Integer> sortIntegerList(List<Integer> list){
		
		if(list == null || list.size() == 0) return null;
		
		List evenList = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		List oddList = list.stream().filter(num -> num % 2 > 0).collect(Collectors.toList());
		
		oddList.addAll(evenList);		
		return oddList;
	}

}
