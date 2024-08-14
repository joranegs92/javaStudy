package com.example.java.generic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Generics2 { // list서브타입만 가능하다

	/*
	* comparable을 가진 타입만 사용할수 있게 지네릭을 사용하는 법
	* 이렇게 정의내려주지 않으면 copareTo를 사용이 불가능하다
	* */
	static <T extends  Comparable<T>> long countGreatrrThan(T[] arr, T elem){
		return Arrays.stream(arr).filter(s-> s.compareTo(elem)<0).count();
	}
	public static void main(String[] args) {
		String[] arr = new String[] {"a","b","c","d"};
		System.out.println(countGreatrrThan(arr,"c"));
	}
}
