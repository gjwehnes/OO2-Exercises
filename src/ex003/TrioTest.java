package ex003;
import static org.junit.Assert.*;

import org.junit.Test;

public class TrioTest {

	@Test
	public void test() {
		
		Sandwich sandwich1 = new Sandwich("Cheeseburger", 2.75);
		Drink drink1 = new Drink("Orange Soda", 1.25);
		Salad salad1 = new Salad("Spinach Salad", 1.25);
				
		Trio trio1 = new Trio(sandwich1, salad1, drink1);		
		assertEquals("Cheeseburger/Spinach Salad/Orange Soda Trio", trio1.getName());
		assertEquals(4.00, trio1.getPrice(), 0.0);
		
		Sandwich sandwich2 = new Sandwich("Club Sandwich", 2.75);
		Drink drink2 = new Drink("Cappuccino", 3.50);
		Salad salad2 = new Salad("Coleslaw", 1.25);
				
		Trio trio2 = new Trio(sandwich2, salad2, drink2);		
		assertEquals("Club Sandwich/Coleslaw/Cappuccino Trio", trio2.getName());
		assertEquals(6.25, trio2.getPrice(), 0.0);
	}

}
