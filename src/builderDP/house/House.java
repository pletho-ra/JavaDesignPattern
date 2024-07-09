package builderDP.house;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private int rooms;
    private boolean hasGarden;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    private House() {
    }

    public static class Builder {
        private House house;

        public Builder() {
            this.house = new House();
        }

        public Builder foundation(String foundation) {
            house.foundation = foundation;
            return this;
        }

        public Builder structure(String structure) {
            house.structure = structure;
            return this;
        }

        public Builder roof(String roof) {
            house.roof = roof;
            return this;
        }

        public Builder rooms(int rooms) {
            house.rooms = rooms;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            house.hasGarden = hasGarden;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            house.hasGarage = hasGarage;
            return this;
        }

        public Builder hasSwimmingPool(boolean hasSwimmingPool) {
            house.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return house;
        }

    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof
                + ", rooms=" + rooms + ", hasGarage=" + hasGarage + ", hasSwimmingPool="
                + hasSwimmingPool + ", hasGarden=" + hasGarden + "]";

    }
}

