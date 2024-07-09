package FactoryDP.AnimalFactory;

public class DogFactory extends AbstractAnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
