package Animal;

public class Cachorro extends Animal {

	public void correr() {
		System.out.println("O cachorro "+getNome()+" de "+getIdade()+" anos está correndo.");
	}
	
	public void emitirSom() {
		System.out.println("O cachorro " + getNome()+ " de "+ getIdade()+ " anos está latindo.");
	}
}
