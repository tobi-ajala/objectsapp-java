import java.util.ArrayList;

public class OnjectsApp {
	ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		new OnjectsApp();
	}
	
	public OnjectsApp()
	{
		students.add(new Student("Shaeika Adams",40,1.5,80));
		students.add(new Student("Antwon Dodson",27,1.8,70));
		students.add(new Student("Nicki Minaj",34,1.2,75));
		students.add(new BBCStudent("Bird Man",37,1.7,83));
		students.add(new BBCStudent("French Montana",18,2.0,79));
		
		for(Student tmp : students) //for each loop
		{
			tmp.display();
		}
	}
}

class Student {
	protected String name;
	protected int age;
	protected double weight, height;
	public Student(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public void display()
	{
		System.out.println("Name = " + name + " age "+age);
	}
}

class BBCStudent extends Student {

	public BBCStudent(String name, int age, double weight, double height) {
		super(name, age, weight, height);
	}

	public void display()
	{
		super.display();
		System.out.println("Hello, I'm super cool");
	}
}