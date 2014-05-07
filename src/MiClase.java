import java.util.Scanner;
public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in); 
		System.out.print("Ingrese Nota1: ");
		double Nota1 = s.nextDouble();
		System.out.print("Ingrese Nota2: ");
		double Nota2 = s.nextDouble();
		System.out.print("Ingrese Nota3: ");
		double Nota3 = s.nextDouble();
		
		System.out.print("Resultado: " + ((Nota1+Nota2+Nota3)/3));
	}

}
