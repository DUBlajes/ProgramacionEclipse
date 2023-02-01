package argumentos.de.programa;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		for (byte i=0;i<args.length;i++) {
			System.out.println(i+": "+args[i]+"\t");
			
			
		}
	}

}

