package com.lichuang.chap02;

/**
 * 选择排序，插入排序，归并排序，快速排序，臭皮匠排序（Stooge Sort）
 *
 */
public class SortList {
	public static void main(String[] args) {
		int[] result = selectionSort(new int[]{12,5,8,9,10,16,1,3,6});
		System.out.println(result);
	}
	
	//选择排序
	//选择排序的基本思想是每次从待排数据中选择第n小的数据放到排序列表的第n个位置
	public static int[] selectionSort(int[] elements){
		int count = elements.length;
		for(int i=0;i<count;i++){
			int tmp = elements[i];
			int location = i;
			for(int j=0;j<count-i-1;j++){
				if(elements[i+j+1] < tmp){
					tmp = elements[i+j+1];
					location = i+j+1;
				}				
			}
			if(i != location){
				int template = elements[location];
				elements[location] = elements[i];
				elements[i] = template;
			}
			
		}
		return elements;
	}

}
