package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("Travis", "macho", "Selvagem");
		System.out.println("--LOBO--");
		lobo.emitirSom();
		
		Gato gato = new Gato("Travis", "macho", "Selvagem");
		System.out.println("--GATO--");
		gato.emitirSom();
		
		Leao leao = new Leao("Travis", "macho", "Selvagem");
		System.out.println("--LEAO--");
		leao.emitirSom();
		
		Cachorro cachorro = new Cachorro("Travis", "macho", "Selvagem");
		System.out.println("--CACHORRO--");
		cachorro.emitirSom();

		Tigre tigre = new Tigre("Travis", "macho", "Selvagem");
		System.out.println("--TIGRE--");
		tigre.emitirSom();
	}

}
