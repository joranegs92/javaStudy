package com.example.java.generic;

public class Generics {
	<T> void printT(T t){ //메소드 레벨에서 타입파라미터 정의가 가능하다
		System.out.println(t.toString());
	}
	public static void main(String[] args) {
		new Generics().printT("hello");
		new Generics().printT(1);
		printS("printS");
		printS(2);
	}
	/*
	* 클래스 단위에 지네릭스가 지정되어있으면 클래스 타입과는 다른 타입을 지정해줘야한다
	* 예를들어 public class Generics <T>{ 로 T타입으로 지정되어잇었으면 반드시 static 영역에는 다른 심볼을 지정한다.
	* static <T> void printS(T s){ <--불가능
	* 그 이유는 static은 인스턴스를 만들지 않아도 쓸수 있는 메서드기 때문
	* */
	static <S> void printS(S s){

		System.out.println(s.toString());
	}


}
