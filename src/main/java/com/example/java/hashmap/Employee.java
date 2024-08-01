package com.example.java.hashmap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	private Integer Id;
	private String nm;

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + getId();
		return result;
	}
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
		return (this.getId() == e.getId());

	}
}
