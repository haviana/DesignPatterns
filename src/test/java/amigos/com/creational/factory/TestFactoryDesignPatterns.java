package amigos.com.creational.factory;

import amigos.com.creational.abstractfactory.Computer;
import amigos.com.creational.abstractfactory.PC;
import amigos.com.creational.abstractfactory.Server;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFactoryDesignPatterns {
    @Test
    public void TestCreationalAbstractPattern() {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "2 GB", "500 GB", "2.4 GHz");
        System.out.printf("AbstractFactory PC Config:: %s%n", pc);

        Assertions.assertInstanceOf(PC.class, pc);
        Assertions.assertInstanceOf(Server.class, server);

        System.out.println("AbstractFactory Server Config::" + server);
    }
}
