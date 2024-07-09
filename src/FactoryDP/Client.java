package FactoryDP;

import FactoryDP.AnimalFactory.AbstractAnimalFactory;
import FactoryDP.AnimalFactory.Animal;
import FactoryDP.AnimalFactory.AnimalType;
import FactoryDP.AnimalFactory.FactoryCreator;

public class Client {
    public static void main(String[] args) throws IllegalArgumentException {
       try{
           AbstractAnimalFactory dogFactory = FactoryCreator.getFactory(AnimalType.DOG);
           Animal dog = dogFactory.createAnimal();
           dog.speak();

           AbstractAnimalFactory catFactory = FactoryCreator.getFactory(AnimalType.CAT);
           Animal cat = catFactory.createAnimal();
           cat.speak();

//           AbstractAnimalFactory unknownFactory = FactoryCreator.getFactory(null);
//           Animal unknown = unknownFactory.createAnimal();
//           unknown.speak();
       } catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
        System.out.println("Debug");
    }
}
