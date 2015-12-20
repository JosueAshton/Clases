class MostrarSobrecarga2 {
		public void disp(String c ) {
		System.out.println(c);
			}
		public void disp(int c  ) {
	  System.out.println(c);
				}
	 }
public class ejemplo2 {
	public static void main(String [] args){
		MostrarSobrecarga2 obj= new MostrarSobrecarga2();
		obj.disp("a");
		obj.disp(5); 
}
}
