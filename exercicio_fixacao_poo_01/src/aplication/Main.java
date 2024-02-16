package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangule;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Rectangule x;
		
		x = new Rectangule();
		System.out.println("Enter rectangule width and height");
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		double area = x.area();
		double perimeter = x.perimeter();
		double diagonal = x.diagonal();
		
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PERIMETER: %.2f%n", perimeter);
		System.out.printf("DIAGONAL: %.2f%n", diagonal);
		
		sc.close();
	}

}
