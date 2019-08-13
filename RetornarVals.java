package vetorEmatriz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RetornarVals {
	

	public static void main(String[] args) throws IOException {
	
		String aux;
		FileReader criar = new FileReader("arrayjson.json");
		BufferedReader ler = new BufferedReader(criar);
		
		aux = ler.readLine();
		aux = aux.replace("[","");
		aux = aux.replace("]","");
		
		String[] vet = aux.split(",");
		int[] vetInt = new int[vet.length];
		
		for (int i = 0; i < vetInt.length; i++) {
			vetInt[i] = Integer.parseInt(vet[i]);
		}
		for (int i = 0; i < vetInt.length; i++) {
			System.out.print(vetInt[i]+ "  ");
		}
		ler.close();
	}

}