
package corejava;

public class Encapsulation {
private int Id;
private String Name;
private int Rollno;

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getRollno() {
	return Rollno;
}

public void setRollno(int rollno) {
	Rollno = rollno;
}

public static void main(String[]args) {
	Encapsulation en =new Encapsulation();
	en.setName("Ayush");
	en.setId(1);
	en.setRollno(33);
	System.out.println("Student name is = "+ en.getName());
	System.out.println("Student roll no is = "+ en.getRollno());
	System.out.println("Student id is = "+ en.getId());
}
}


