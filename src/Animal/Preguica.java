package Animal;

public class Preguica extends Animal {

	public void escalarArvore() {
		System.out.println("A preguiça "+getNome()+" de "+getIdade()+" anos está subindo na árvore.");
	}
	
	public void emitirSom() {
		System.out.println("A preguiça "+getNome()+" de "+getIdade()+" anos está fazendo barulho.");
	}
}