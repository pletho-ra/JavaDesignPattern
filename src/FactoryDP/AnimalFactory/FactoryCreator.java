package FactoryDP.AnimalFactory;

public class FactoryCreator {
    public static AbstractAnimalFactory getFactory(AnimalType type) throws IllegalArgumentException {
        switch (type){
            case DOG -> {
                return new DogFactory();
            }
            case CAT -> {
                return new CatFactory();
            }
            default ->  throw new IllegalArgumentException("Animal type is not supported");
        }
    }
}
