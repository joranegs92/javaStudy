package com.example.java.generic;

public class Generics {
	<T> void printT(T t){ //메소드 레벨에서 타입파라미터 정의가 가능하다
		System.out.println(t.toString());
	}
	public static void main(String[] args) {
		new Generics().printT("hello");
		new Generics().printT(1);
	}
}
