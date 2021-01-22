package day_12_switch_statements;

public class Browser {

	public static void main(String[] args) {
		
		String browser = "Chrome";
		String path = "null"; //using null as a place holder. It will be switched out with switch case anyways
		
		switch (browser) {
		case "Chrome":
			System.out.println("Open Chrome");
			path = "C://chrome";
			break;
			
		case "Firefox":
			System.out.println("Open Firefox");
			path = "C//driver//firefox";
			break;
			
		case "IE":
			System.out.println("Open IE");
			path = "C://driver//IE";
			break;
			
		case "Safari":
			System.out.println("Open Safari");
			path = "C://driver//safari";
			break;
		
		case "Edge":
			System.out.println("Open Edge");
			path = "C//driver//edge";
		break;
		
			default:
				System.out.println("We don't suppert " + browser + " browser");
			break;
		}
			System.out.println(browser + " is under " + path );
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
