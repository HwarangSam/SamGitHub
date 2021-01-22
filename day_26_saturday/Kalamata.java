package day_26_saturday;

public class Kalamata extends Olive {

	public Kalamata() {		//default constructor bc no parameter
		super("Kalamata", 55555L, 5);	//using inheritance to use constructor from super class. default constructor is included
}

	@Override
	public String getOrigin() {
		return "France";
	}
}//hover over and click add unimplemented method