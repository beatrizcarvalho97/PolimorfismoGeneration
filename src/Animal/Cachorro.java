package Animal;

public class Cachorro extends Animal {

	public void correr() {
		System.out.println("O cachorro "+getNome()+" de "+getIdade()+" anos est� correndo.");
	}
	
	public void emitirSom() {
		System.out.println("O cachorro " + getNome()+ " de "+ getIdade()+ " anos est� latindo.");
	}
}
