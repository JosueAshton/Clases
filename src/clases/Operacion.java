
public class Operacion {

	public static int max (int a , int b){
		if(a>=b)
			return a ;
		else
			return b ;
	}
	public static void main(String[] args) {
      System.out.println( Operacion.max(5, 19));
		int val = max(4,max(3,max(10,5)));
      System.out.println(val);
	}

}
