package Animal;

public class Cavalo extends Animal {
	
	public void correr () {
		System.out.println("O Cavalo "+getNome()+" de "+getIdade()+" anos est� galopando.");
	}
	
	public void emitirSom() {
		System.out.println("O Cavalo "+getNome()+" de "+getIdade()+" anos est� relinchando.");
	}
	
}
