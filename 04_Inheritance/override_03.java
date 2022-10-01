
class Super{
	public void display() {
		System.out.println("Display in Super class");
	}
}
class Sub extends Super{
	//override method
	public void display(int x) {
		System.out.println("Display in Sub class");
	}
}
public class Overridden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dynamic Method dispatch
		Super sup = new Sub();

		sup.display(); // Display in Super class
		//display(int x) is different method as its signature changed
		

	}

}
