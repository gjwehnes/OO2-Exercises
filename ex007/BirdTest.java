import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//2026-08-06
public class BirdTest {

        @Test
        public void testMethods() {
                
                Bird bird = new Bird();
                Crow crow = new Crow();
                Penguin penguin = new Penguin();

                assertEquals("chirp chirp chirp", bird.vocalize());
                assertEquals("caw caw caw", crow.vocalize());
                assertEquals("Aw-gaw-gaw-gaw", penguin.vocalize());

                assertEquals("whoosh whoosh", crow.fly());
        }

        @Test
        public void testHierarchy() {

                //penguin should be a Bird
                assertEquals("class Bird", Penguin.class.getSuperclass().toString());
                assertNotEquals("class FlyingBird", Penguin.class.getSuperclass().toString());

                //crow should be a FlyingBird
                assertNotEquals("class Bird", Crow.class.getSuperclass().toString());
                assertEquals("class FlyingBird", Crow.class.getSuperclass().toString());

                // check if Bird does NOT contain the fly method
                for (Method method : Bird.class.getMethods()) {
                        if (method.getName().contains("fly")) {
                                fail("fly method found in Bird; not all birds can fly!");
                        }
                }

                //check if FlyingBird class exists
                Class<?> flyingBirdClass = null;
                try {
                        flyingBirdClass = Class.forName("FlyingBird");
                } catch (ClassNotFoundException e) {
                        fail("class FlyingBird does not exist");
                }
                
                // check if FlyingBird DOES contain the fly method
                boolean found = false;
                for (Method method : flyingBirdClass.getMethods()) {
                        if (method.getName().contains("fly")) {
                                found = true;
                                break;
                        }
                }
                assertEquals(true, found, "fly method not found in FlyingBird");

                // check if an instance of FlyingBird does return correct output when the fly method is invoked
                Method fly = null;
                Object output = null;
                try {
                        Object flyingBird = flyingBirdClass.getDeclaredConstructor().newInstance();                
                        fly = flyingBirdClass.getMethod("fly");
                        output = fly.invoke(flyingBird);
                } catch (Exception e) {
                        fail(e.toString());
                }
                assertEquals("flap flap flap", output);
        }

}