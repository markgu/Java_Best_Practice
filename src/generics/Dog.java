package generics;

import java.util.ArrayList;
import java.util.Collection;

public class Dog extends Animal {
	
	// Generics Upper Bounds
	// Collections of any type of Animal only be allowed
	public <T> void playWith(Collection<? extends Animal> playGroup){
	}
	
	// Generics Lower Bounds
	// Collections of any super type of T should be allowed
	public static <T> void copy(Collection<T> from, Collection<? super T> to){
		// copy 
	}
	
	public static void main(String args[]){
		
			Collection<Dog> dogs = new ArrayList<Dog>();
			Collection<Integer> ints = new ArrayList<Integer>();
			Collection<Animal> animals = new ArrayList<Animal>();
			Dog aDog = new Dog();
			aDog.playWith(dogs);
			aDog.playWith(animals);
			//aDog.playWith(ints);   // should not happen!  to fix this Collection<? extends Animal> is the answer
					
			
			ArrayList<Dog> dogList1 = new ArrayList<Dog>();
			ArrayList<Dog> dogList2 = new ArrayList<Dog>();
			
			copy(dogList1, dogList2);
			
			ArrayList<Animal> animalList = new ArrayList<Animal>();
			
			copy(dogList1, animalList);  // <? super T> make it possible
			
			aDog.playWith(dogList1);	// ArrayList is Collection so it's possible
		
		
	}

}
