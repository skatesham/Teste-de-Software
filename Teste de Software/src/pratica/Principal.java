package pratica;

/**
 * Primeira Aula de Teste de Software no Laboratório
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
