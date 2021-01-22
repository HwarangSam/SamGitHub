package day_22_oop_encapsulation;

public class Item {

	//instance variables
	private String name;
	private double unitPrice;
	private int quantity;
	
	//constructor using fields (right click, source, generate constructor using fields
	public Item() {}   //idk why this
	public Item(String name, double unitPrice, int quantity) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//instance methods calcCost(): returns the total cost as double
	//apply encaps
	//totalcost = unitprice * quantity
	
	public double calcCost () {
		return unitPrice*quantity;
		
	}
}
