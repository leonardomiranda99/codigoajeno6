package codigo6;
//faltaba un package
public class codigo6 {
	
// faltaba el public estatic void
public static void main (String[] args) {
	    int[] n = int[20];
// i ++ para sumar si solo se usa 
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.print(n[i] + " ");
	    }
	    //mal escrito el println
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //faltaba un )
	    int opcion = Integer.parseInt(System.console().readLine());
//deberia ser un boolean
	    boolean multiplo = (opcion == 1) : 5 ? 7;

	    foreach (char e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      //aqui faltaba una etiqueta de cierre en el else{
	      }else{
	        System.in.print(e + " ");
	      }
	    }
	   }
}



