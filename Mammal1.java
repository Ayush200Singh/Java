package corejava;

class Animal{
	public void Eat() {
		System.out.println("I am omnivorous");
	}
}
class Mammal2 extends Animal {
	public void Nature() {
		System.out.println("I am Mammal");
	}
}
class Dog extends Mammal2{
	public void Sound() {
		System.out.println("Dog bark");
	}
}
public class Mammal {
	public static void main(String[] args) {
	 Dog dg = new Dog();
	 dg.Eat();
	 dg.Sound();
	 dg.Nature();

	}

}

