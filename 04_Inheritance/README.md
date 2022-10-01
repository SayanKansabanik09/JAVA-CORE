
# this()




## Documentation

this() is used to call one constructor from the other of the same class.



## Deployment

```bash
import java.io.*;
public class Student {

	private String name;
	private int age;

	// Note that in the Constructor below "this keyword" is
	// used to differentiate between the local variable and
	// the instance variable.

	public Student(String name, int age)
	{
		// Assigns the value of local name variable
		// to the name(instance variable).
		this.name = name;
		// Assigns the value of local Age variable
		// to the Age(instance variable).
		this.age = age;
	}

	public void show()
	{
		System.out.println("Name = " + this.name);
		System.out.println("Age = " + this.age);
	}

	public static void main(String[] args)
	{
		// Creating new instance of Student Class
		Student student = new Student("Geeks", 20);
		student.show();
	}
}

```

