package com.hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FinalInstances {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(19);
		list.add(89);
		System.out.println(finalInstances(5, list));
	}

	
	public static int finalInstances(int instances, List<Integer> averageUtil) {
		if(averageUtil!=null && averageUtil.size()>0) {
			//averageUtil.remove(0);
			//averageUtil.remove(1);
			ListIterator<Integer> averageUtilValues = averageUtil.listIterator();
			int counter = 0;
			while(averageUtilValues.hasNext()) {
				if(counter>0) {
					counter --;
					continue;
				}
				if(instances==1) {
					if(averageUtilValues.next().intValue() > 60) {
						instances = instances * 2;
						break;
					}
				}else {
					if(averageUtilValues.next().intValue() < 25) {
						instances = (int) Math.ceil(new Double(instances) / 2.0);
						counter = 10;
						continue;
					}else if(averageUtilValues.next().intValue() > 60) {
						instances = instances * 2;
						counter = 10;
						continue;
					}else{
                        continue;
                    }
				}
			}
		}
		return instances;
	    }
}
