package day_26_saturday;

import java.util.ArrayList;

public class OlivePress {
	
	public int getOil(ArrayList<Olive>list) {	//parameter name is just list
		
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total+= list.get(i).crush(); //the public variable for "oil" was changed to public var "crush" add() too
		}
		return total;
	}
	
}
