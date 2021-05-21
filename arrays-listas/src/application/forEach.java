package application;

public class forEach {

	public static void main(String[] args) {
	
		String[] vect = new String[] {"Pedro", "Juliana", "Olivia"};
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		/* (tipo   apelido : nomeDoVetor) */
		for(String nomes: vect) {
			System.out.println(nomes.toUpperCase());
			System.out.println(nomes.toLowerCase());
		}
	}

}
