package com.kroger.student.studentapp;

import java.util.Comparator;

public class AddressComparator implements Comparator<Address> {

	@Override
	public int compare(Address o1, Address o2) {
		return o1.getZipcode()-o2.getZipcode();
	}
	
}
