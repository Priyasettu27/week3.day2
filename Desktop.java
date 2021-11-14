package week3.day2;

public class Desktop implements HardWare,Software  {

	public void desktopModel() {
		System.out.println("Desktop model method called");
	}
	
	public void softwareResources() {
		System.out.println("Software resource method implemented");
		
	}

	public void hardwareResources() {
		System.out.println("Hardware resource method implemented");
		
	}
	public static void main(String[] args) {
		
		Desktop imp=new Desktop();
		imp.desktopModel();
		imp.hardwareResources();
		imp.softwareResources();

	}

	

}
