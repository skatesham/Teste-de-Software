package pratica;

/**
 * Primeira Aula de Teste de Software no Laborat�rio
 * 
 * @author Sham Vinicius Fiorin
 *
 */
public class Principal {
	/**
	 * Classe Principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		a.x()
		;
		b.x();
		b.w();
		b.r();
		
		C c = b;
		c.r();
	}

}
