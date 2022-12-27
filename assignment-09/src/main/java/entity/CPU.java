package entity;

public class CPU {
    private int price;

    public CPU(int price) {
        this.price = price;
    }

    public class Processor {
        private int coreAmount;
        private String manufacturer;

        public Processor(int coreAmount, String manufacturer) {
            this.coreAmount = coreAmount;
            this.manufacturer = manufacturer;
        }

        public double getCache() {
            return 4.3;
        }
    }

    public class Ram {
        private int memory;
        private String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public double getClockSpeed() {
            return 5.5;
        }
    }
}
