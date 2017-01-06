package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.List;

/**
 * 检查指定的元素是否出现在列表中
 *
 */
public class CheckElement {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add("hello");
		list.add("world");
		list.add(2);
		list.add(false);
		boolean flag =  checkElement(list,true);
		System.out.println("是否存在："+flag);
		
	}
	
	private static boolean checkElement(List<Object> list,Object o){
		for (Object object : list) {
			if(object == o){
				return true;
			}
		}		
		return false;
	}
}
