package day_26_saturday;

public abstract class Olive {	//created object "Olive" that can be used similarly as a data type now(?). Change to abstract

	//let's encapsulate by making instance variables private
		private String name = "Kalamata";
		private long color =  10552646L;
		private int oil = 5;
	
	public Olive(){}	//create default constructor
	public abstract String getOrigin();
		
		public Olive(String name, long color, int oil){	//then parameterized constructor
//			this.name = name;
			setName(name);
			setColor(color);
			setOil(oil);
		}
		
		//right click; source; generate getters and setters; choose all variables to set
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getColor() {
			return color;
		}
		public void setColor(long color) {
			this.color = color;
		}
		public int crush() {		//let's change getOil to crush since we already named ANOTHER method getOil
			String message = name + " olive from " + getOrigin() + " " + oil + " units";
			System.out.println(message);
			System.out.println("Ouch!");
			return oil;
		}
		public void setOil(int oil) {
			this.oil = oil;
		}
		

	
}