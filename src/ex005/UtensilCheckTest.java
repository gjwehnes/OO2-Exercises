package ex005;

import static org.junit.Assert.*;

import org.junit.Test;

import ex003.Drink;
import ex003.Salad;
import ex003.Sandwich;
import ex003.Trio;
import ex004.Cappuccino;
import ex004.ClubSandwich;
import ex004.SpinachSalad;

public class UtensilCheckTest {

	@Test
	public void test() {
		
		Sandwich sandwich = new Sandwich("Cheeseburger", 2.75);
		Salad salad = new Salad("Spinach Salad", 1.25);
		Drink drink = new Drink("Orange Soda", 1.25);
				
		assertEquals(true, UtensilCheck.requireFork(sandwich));
		assertEquals(true, UtensilCheck.requireFork(salad));
		assertEquals(false, UtensilCheck.requireFork(drink));

		assertEquals(true, UtensilCheck.requireKnife(sandwich));
		assertEquals(false, UtensilCheck.requireKnife(salad));
		assertEquals(false, UtensilCheck.requireKnife(drink));
		
		assertEquals(false, UtensilCheck.requireSpoon(sandwich));
		assertEquals(false, UtensilCheck.requireSpoon(salad));
		assertEquals(false, UtensilCheck.requireSpoon(drink));
		
		Cappuccino cappuccino = new Cappuccino();
		assertEquals(false, UtensilCheck.requireStraw(drink));
		assertEquals(true, UtensilCheck.requireStraw(cappuccino));
		
	}


}
