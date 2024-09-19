package amigos.com.strutural.strategy;

import amigos.com.strucutral.strategy.CreditCardStrategy;
import amigos.com.strucutral.strategy.Item;
import amigos.com.strucutral.strategy.PaypalStrategy;
import amigos.com.strucutral.strategy.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    void ShoppingCartTest(){
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));

        Assertions.assertEquals(cart.calculateTotal(), 50);

    }
}
