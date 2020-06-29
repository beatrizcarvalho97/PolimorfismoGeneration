package Animal;

public class MainAnimal {
	
	public void acaoAnimal( Animal animal)
	{
		animal.correr();
		animal.emitirSom();
		animal.escalarArvore();
	}
	
	public void acaoVet(Animal animal) {
		animal.examinar();
	}

	public static void main(String[] args) {
		
		Cavalo horse = new Cavalo();
		horse.setNome("Flash");
		horse.setIdade(15);
		horse.setSom("relinchou");
		
		Cachorro dog = new Cachorro();
		dog.setNome("Rex");
		dog.setIdade(3);
		dog.setSom("latiu");
		
		Preguica sloth = new Preguica();
		sloth.setNome("Ted");
		sloth.setIdade(8);
		sloth.setSom("fez barulho");
		MainAnimal verifica = new MainAnimal();
		Veterinario vet = new Veterinario();
		verifica.acaoAnimal(horse);
		vet.examinar(horse);
		System.out.println("\n ------------------------------------ \n");
		verifica.acaoAnimal(dog);
		vet.examinar(dog);
		System.out.println("\n ------------------------------------ \n");
		verifica.acaoAnimal(sloth);
		vet.examinar(sloth);
		
	}

}
