package builderDP;

import builderDP.house.House;

public class Client {
    public static void main(String[] args) {
        House house = new House.Builder()
                .foundation("Concrete and steel foundation")
                .structure("Concrete and brick structure")
                .roof("Concrete and tile roof")
                .rooms(4)
                .hasGarage(true)
                .hasGarden(true)
                .hasSwimmingPool(false)
                .build();

        System.out.println(house);
    }
}
