package Animal;

public class Veterinario extends Animal{

	public void examinar(Animal animal) {
		System.out.println("Ao ser atendido pelo veterinário,"+animal.getNome()+" "+animal.getSom()+".");
		}
	}