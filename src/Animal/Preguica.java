package Animal;

public class Preguica extends Animal {

	public void escalarArvore() {
		System.out.println("A pregui�a "+getNome()+" de "+getIdade()+" anos est� subindo na �rvore.");
	}
	
	public void emitirSom() {
		System.out.println("A pregui�a "+getNome()+" de "+getIdade()+" anos est� fazendo barulho.");
	}
}