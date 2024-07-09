package FactoryDP.AnimalFactory;

public class CatFactory extends AbstractAnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
