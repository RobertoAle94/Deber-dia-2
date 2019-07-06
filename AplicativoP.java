import java.util.Scanner;
public class AplicativoP{
	public static void main(String []args){
	String nombre;
	float precio;
	int cantidad;

Scanner lee=new Scanner(System.in);
	System.out.println("Ingrese nombre:   ");
		nombre=lee.next();
	System.out.println("Ingrese precio:   ");
		precio=lee.nextFloat();
	System.out.println("Ingrese cantidad:   ");
		cantidad=lee.nextInt();
	Producto obj1=new Producto(nombre, precio, cantidad);
		obj1.ImprimirDatos();
		}
}