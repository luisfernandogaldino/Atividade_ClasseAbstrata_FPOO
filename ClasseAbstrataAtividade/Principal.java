package ClasseAbstrataAtividade;

public class Principal {

	public static void main(String[] args) {

		Lobo lobo =new Lobo("loboFilhote","M","Lobo-cinzento");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		System.out.println(" ");
		
		Leao leao =new Leao("LeãoPai","M","Leão asiático. ");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		System.out.println(" ");

		Tigre tigre =new Tigre("TigrePai","M","Tigre-siberiano. ");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		System.out.println(" ");
		
		Cachorro cachorro =new Cachorro("Luke.","M","Pastor Alemão ");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		System.out.println(" ");

		Gato gato =new Gato("Simba","M","Gato Siamês");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();



	}

}
