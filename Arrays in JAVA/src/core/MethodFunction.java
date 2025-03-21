package core;

public class MethodFunction {

	private int b=25;
	private String myName="Keerthana";
	/*public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	*/

	private void display() {
		System.out.println("Methods-Functions");
	}
	
	public String display1() {
		display();
		return myName;
	}
	
	public void  display2(int x, int y, int z) {
		System.out.println("Add:"+(x+y+z));
	}
}

