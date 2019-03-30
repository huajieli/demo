package com.daily.demo.sort;
/**
 * 冒泡排序
 * @author lihuajie
 * @2019年3月28日上午9:58:23
 */
public class MaoPao {
	public static void main(String[] args) {
		int arr[]= {6,5,9,1,0,3,4,2};
		System.out.println(sortArray(arr));
	}

	private static int[] sortArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int s = arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
			}
		}
		
		return arr;
	}

}
