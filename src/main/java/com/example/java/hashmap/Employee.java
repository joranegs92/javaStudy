package com.example.java.hashmap;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Employee {
	private Integer Id;
	private String nm;



	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (getClass() != o.getClass()) {
			return false;
		}

		Employee e = (Employee) o;
		return nm == e.nm && Objects.equals(Id,e.Id);

	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, nm);
	}


}
