package Animal;

public class Cavalo extends Animal {
	
	public void correr () {
		System.out.println("O Cavalo "+getNome()+" de "+getIdade()+" anos está galopando.");
	}
	
	public void emitirSom() {
		System.out.println("O Cavalo "+getNome()+" de "+getIdade()+" anos está relinchando.");
	}
	
}
