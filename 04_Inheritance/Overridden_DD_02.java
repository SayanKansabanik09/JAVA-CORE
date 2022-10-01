
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
		// Dynamic Method dispatch
		Super sup = new Sub();
		//sup is reference of Super class which is 
		//referring to the Object of Sub class.
		sup.display(); // Display in Sub class
		//the override method is called base on Object
	}

}
