package amigos.com.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void TestCreationalBuilderPattern() {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").build();
        System.out.println("Builder PC Config::"+computer);

        Assertions.assertEquals("500 GB", computer.getHDD());
        Assertions.assertEquals("2 GB", computer.getRAM());


    }
    @Test
    public void TestCreationalBuilderPatternWitOptionals() {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(false).setGraphicsCardEnabled(true).build();
        System.out.println("Builder PC Config::"+computer);

        Assertions.assertEquals("500 GB", computer.getHDD());
        Assertions.assertEquals("2 GB", computer.getRAM());
        Assertions.assertFalse(computer.isBluetoothEnabled());
        Assertions.assertTrue(computer.isGraphicsCardEnabled());

    }
}
