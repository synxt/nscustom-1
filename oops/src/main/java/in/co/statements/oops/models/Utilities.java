package in.co.statements.oops.models;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
	public static List<String> toUpperCase(List<String> values){
		List<String> upperValues = new ArrayList<String>();
		for(String value:values) {
			upperValues.add(value.toUpperCase());
		}
		return upperValues;
	}
}
