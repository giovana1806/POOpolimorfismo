package interfaceAnimal;

public class Leao implements Animal{
	@Override
	public void dormir() {
		System.out.println("o leao esta dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("o leao esta caminhando");
	}
	@Override
	public void correr() {
		System.out.println("o leao esta correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("o leao esta rugindo");
	}
}
