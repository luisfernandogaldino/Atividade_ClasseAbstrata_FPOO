package ClasseAbstrataAtividade;

public class Lobo extends Animal {

	public Lobo(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void dormir() {
		System.out.println("O lobo está dormindo");

	}

	@Override
	public void caminhar() {
		System.out.println("O lobo vai caminhar");

	}

	@Override
	public void correr() {
		System.out.println("O lobo vai correr rápido");

	}

	@Override
	public void emitirSom() {
		System.out.println("O lobo está uivando");

	}


}
