
 class MostrarSobrecarga {

	public void disp(String c ) {
	System.out.println(c);
}
	public void disp(String c , int num ) {
		System.out.println(c+""+num);
	}
	public void disp(int c , int num ) {
		System.out.println(c+""+num);
}
}


public class Ejemplo1 {
	public static void main(String [] args){
		MostrarSobrecarga obj= new MostrarSobrecarga();
		obj.disp("ejemplo");
		obj.disp("ejemplo  ",10);
		obj.disp(1,2);
	}
	
}
