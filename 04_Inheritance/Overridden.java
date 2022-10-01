
class Super{
	public void display() {
		System.out.println("Display in Super class");
	}
}
class Sub extends Super{
	//override method
	public void display() {
		System.out.println("Display in Sub class");
	}
}
public class Overridden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Super();
		sup.display(); // Display in Super class
		
		Sub sb = new Sub();
		sb.display(); // Display in Sub class
	}

}
