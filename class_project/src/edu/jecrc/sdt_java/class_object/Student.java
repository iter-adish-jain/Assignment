package edu.jecrc.sdt_java.class_object;

import java.util.Objects;

public class Student {
	int id;
	String name;
	String mailId;
	long contactNumber;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contactNumber=" + contactNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(contactNumber, id, mailId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return contactNumber == other.contactNumber && id == other.id && Objects.equals(mailId, other.mailId)
				&& Objects.equals(name, other.name);
	}
	
	
	
}
