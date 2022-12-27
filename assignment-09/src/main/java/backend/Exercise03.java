package backend;

import entity.CPU;

public class Exercise03 {
    public static void question01() {
        CPU cpu = new CPU(1000);
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.Ram ram = cpu.new Ram(8, "Samsung");
        System.out.println("processor.getCache() = " + processor.getCache());
        System.out.println("ram.getClockSpeed() = " + ram.getClockSpeed());
    }
}
