package amigos.com.creational.abstractFactory;

import amigos.com.creational.abstractfactory.Computer;
import amigos.com.creational.abstractfactory.ComputerFactory;
import amigos.com.creational.abstractfactory.PCFactory;
import amigos.com.creational.abstractfactory.ServerFactory;
import org.junit.jupiter.api.Test;

public class TestAbstractFactoryDesignPatterns {
@Test
    public  void TestCreationalAbstractPattern() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
