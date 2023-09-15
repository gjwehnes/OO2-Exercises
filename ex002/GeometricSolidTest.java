import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GeometricSolidTest implements GeometricSolid 
{
	@Override
    public double getVolume() {
        return 0;
    }

	@Override
	public double getSurfaceArea() {
		return 0;
	}

	@Test
   public void test()
   {
	   //dummy test... as long as this test compiles, the interface is written correctly
       assertEquals(true,true);
   }
	

}
