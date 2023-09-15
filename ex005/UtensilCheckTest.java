//2023-02-19
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class UtensilCheckTest {

	@Test
	public void test() {
		
		Sandwich sandwich = new Sandwich("Cheeseburger", 2.75);
		Salad salad = new Salad("Spinach Salad", 1.25);
		Drink drink = new Drink("Orange Soda", 1.25);
		Cappuccino cappuccino = new Cappuccino();

		//basic functionality tests
		assertEquals(true, UtensilCheck.requireFork(sandwich));
		assertEquals(true, UtensilCheck.requireFork(salad));
		assertEquals(false, UtensilCheck.requireFork(drink));
		assertEquals(false, UtensilCheck.requireFork(cappuccino));

		assertEquals(true, UtensilCheck.requireKnife(sandwich));
		assertEquals(false, UtensilCheck.requireKnife(salad));
		assertEquals(false, UtensilCheck.requireKnife(drink));
		assertEquals(false, UtensilCheck.requireKnife(cappuccino));
		
		assertEquals(false, UtensilCheck.requireSpoon(sandwich));
		assertEquals(false, UtensilCheck.requireSpoon(salad));
		assertEquals(false, UtensilCheck.requireSpoon(drink));
		assertEquals(true, UtensilCheck.requireSpoon(cappuccino));
		
		assertEquals(false, UtensilCheck.requireStraw(sandwich));
		assertEquals(false, UtensilCheck.requireStraw(salad));
		assertEquals(true, UtensilCheck.requireStraw(drink));
		assertEquals(false, UtensilCheck.requireStraw(cappuccino));

		//check if the methods accept objects of type MenuItem, and are not simply overloaded with specific types for parameter
		for (Method method : UtensilCheck.class.getMethods()) {
			if (method.getName().contains("require")) {
				assertEquals(1, method.getParameterCount());
				Parameter parameter = method.getParameters()[0];
				assertEquals(true,parameter.getType().equals(MenuItem.class));
			}
		}		
		
	}

}
