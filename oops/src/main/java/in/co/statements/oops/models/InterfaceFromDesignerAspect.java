package in.co.statements.oops.models;

import java.util.ArrayList;
import java.util.List;

public class InterfaceFromDesignerAspect {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Vamsi");
		names.add("Krishna");
		names.add("Sathan");
		names.add("Sannareddy");
		names.add("Synxt");
		List<String> upperNames = Utilities.toUpperCase(names);
		System.out.println(upperNames);
		
		
	}
}
