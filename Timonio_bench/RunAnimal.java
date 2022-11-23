import java.util.Scanner;
public class RunAnimal{
public static void main (String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog:");
	String c = sc.nextLine();
	if(c.equalsIgnoreCase("B")){
		Bird ibon = new Bird();
		ibon.eat();
		ibon.sleep();
		ibon.makesound();
	}
	else if(c.equalsIgnoreCase("C")){
		Cat pusa = new Cat();
		pusa.eat();
		pusa.sleep();
		pusa.makesound();
	}
	else if(c.equalsIgnoreCase("D")){
		Dog aso = new Dog();
		aso.eat();
		aso.sleep();
		aso.makesound();
	}
	else {
		System.out.print("Invalid Input");
	}
	sc.close();
}
}