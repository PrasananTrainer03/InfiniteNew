package com.java.gen;

import java.util.Comparator;

public class BasicComparator implements Comparator<Employ> {

	@Override
	public int compare(Employ o1, Employ o2) {
		return o1.getBasic() - o2.getBasic();
	}

}
