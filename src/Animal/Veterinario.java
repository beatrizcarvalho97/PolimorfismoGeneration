package Animal;

public class Veterinario extends Animal{

	public void examinar(Animal animal) {
		System.out.println("Ao ser atendido pelo veterin�rio,"+animal.getNome()+" "+animal.getSom()+".");
		}
	}