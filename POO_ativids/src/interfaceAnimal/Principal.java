package interfaceAnimal;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo();
		System.out.println("--LOBO--");
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		lobo.emitirSom();
		
		Leao leao = new Leao();
		System.out.println("--LEAO--");
		leao.caminhar();
		leao.correr();
		leao.dormir();
		leao.emitirSom();
	}

}
