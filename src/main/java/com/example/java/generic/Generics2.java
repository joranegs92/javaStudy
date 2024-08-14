package com.example.java.generic;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

public class Generics2 <T extends List>{ // list서브타입만 가능하다

	//static < Serializable & Comparator> void print(T t){} //타입 여러개도 가능하다.
	public static void main(String[] args) {

	}
}
