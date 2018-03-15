package ex3;

import ex3.TP.Animal;
import ex3.TP.ComportementAnimal;
import ex3.TP.TypeAnimal;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", ComportementAnimal.HERBIVORE, TypeAnimal.MAMMIFERE));
		zoo.addAnimal(new Animal("Zèbre", ComportementAnimal.HERBIVORE, TypeAnimal.MAMMIFERE));
		zoo.addAnimal(new Animal("Lion", ComportementAnimal.HERBIVORE, TypeAnimal.MAMMIFERE));
		zoo.addAnimal(new Animal("Panthère", ComportementAnimal.CARNIVORE, TypeAnimal.MAMMIFERE));
		zoo.addAnimal(new Animal("Requin blanc", ComportementAnimal.HERBIVORE, TypeAnimal.POISSON));
		zoo.addAnimal(new Animal("Truite dorée", ComportementAnimal.HERBIVORE, TypeAnimal.POISSON));
		zoo.addAnimal(new Animal("Boa constrictor", ComportementAnimal.CARNIVORE, TypeAnimal.REPTILE));
		zoo.addAnimal(new Animal("Python", ComportementAnimal.CARNIVORE, TypeAnimal.REPTILE));
		
		// Affichage de toutes les zones et animaux
		zoo.afficherListeAnimaux();
	}

	
}
