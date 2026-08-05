import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExtensionTest {

	@Test
	public void test() {
	
		Cappuccino cappuccino = new Cappuccino();
		ClubSandwich clubSandwich = new ClubSandwich();
		SpinachSalad spinachSalad = new SpinachSalad();

		Trio trio1 = new Trio(clubSandwich, spinachSalad, cappuccino);		
		assertEquals("Club Sandwich/Spinach Salad/Cappuccino Trio", trio1.getName());
		assertEquals(6.25, trio1.getPrice(), 0.001);
		
	}

	@Test
	public void testExtension() {
		Cappuccino cappuccino = new Cappuccino();
		ClubSandwich clubSandwich = new ClubSandwich();
		SpinachSalad spinachSalad = new SpinachSalad();

		assertEquals(true, cappuccino instanceof Drink);
		assertEquals(true, cappuccino instanceof MenuItem);
		assertEquals(true, cappuccino instanceof Sandwich);
		assertEquals(true, cappuccino instanceof MenuItem);
		assertEquals(true, cappuccino instanceof Salad);
		assertEquals(true, cappuccino instanceof MenuItem);
	}


}
