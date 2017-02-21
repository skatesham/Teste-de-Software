package aula;

import java.math.BigInteger;

/**
 * Classe principal do programa de teste
 * @author Sham Vinicius Fiorin
 *
 */
public class Principal {
	/**
	 * Classe testar
	 * @param a
	 * @param b
	 * @param c
	 * @return boolean
	 */
	public static boolean testOp(int a, int b, int c){
		Operacao o = new Operacao();
		return o.soma(a,b) == c ? true : false; 
	}
	/**
	 * metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Aula Parte 1
		//System.out.println(testOp(2, 3, 5));
		//System.out.println(testOp(0, 0, 0));
		
		int[][] lista = {{0,0,0},{2,3,5},{2,2,4}};
		
		for(int i=0; i < lista.length; i++){
			System.out.println(testOp(lista[i][0], lista[i][1], lista[i][2]));
		}
		
		//tamanho de um inteiro, dividido em . e explicação de Static Final
		//System.out.format("%,d",Integer.MAX_VALUE);
		



	}

}
