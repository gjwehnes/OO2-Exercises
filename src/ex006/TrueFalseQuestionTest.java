package ex006;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TrueFalseQuestionTest {

	@Test
	public void testCorrectResponses() {

		TrueFalseQuestion tfq = new TrueFalseQuestion();

		//correct responses
		tfq.setText("Albert Einstein was the inventer of Java.");
		tfq.setAnswer("false");
		assertEquals(true, tfq.checkAnswer("false"));

		tfq.setText("The original name for Java was Oak.");
		tfq.setAnswer("true");
		assertEquals(true, tfq.checkAnswer("true"));
	}

	public void testCaseInsensitive() {

		TrueFalseQuestion tfq = new TrueFalseQuestion();

		//correct responses, case insensitive
		tfq.setText("Albert Einstein was the inventer of Java.");
		tfq.setAnswer("false");
		assertEquals(true, tfq.checkAnswer("fALSe"));

		tfq.setText("The original name for Java was Oak.");
		tfq.setAnswer("TrUE");
		assertEquals(true, tfq.checkAnswer("true"));
	}

	public void testOneLetterResponse() {

		TrueFalseQuestion tfq = new TrueFalseQuestion();

		//correct responses, one letter
		tfq.setText("Albert Einstein was the inventer of Java.");
		tfq.setAnswer("false");
		assertEquals(true, tfq.checkAnswer("f"));

		tfq.setText("The original name for Java was Oak.");
		tfq.setAnswer("TrUE");
		assertEquals(true, tfq.checkAnswer("t"));
	}

	public void testIncorrectResponse() {

		TrueFalseQuestion tfq = new TrueFalseQuestion();

		//incorrect responses
		tfq.setText("James Gosling is an alumni of William Aberhart High School.");
		tfq.setAnswer("true");
		assertEquals(false, tfq.checkAnswer("f"));

		tfq.setText("The original name for Java was Oak.");
		tfq.setAnswer("false");
		assertEquals(false, tfq.checkAnswer("t"));

	}

	public void testGetText() {
		TrueFalseQuestion tfq = new TrueFalseQuestion();

		//incorrect responses
		tfq.setText("Albert Einstein was the inventer of Java.");
		assertEquals("Answer True or False: Albert Einstein was the inventer of Java.", tfq.getText());
	}
	
	public void testValidation() {
		
		//this test is here to keep you honest!
		
		TrueFalseQuestion tfq = new TrueFalseQuestion();
		
		//check if tqf indeed inherits from Question
		assertEquals(true, tfq instanceof Question);
		assertEquals(false, tfq.getClass().equals(Question.class));
				

		//the Question class has a backdoor method that resets the instance variables
		//this checks that you are using the superclass's version of these variables
		tfq.validation("test");		
		assertEquals("Answer True or False: test", tfq.getText());
		assertEquals("test", tfq.getAnswer());
				
		tfq.validation("other");		
		assertEquals("Answer True or False: other", tfq.getText());
		assertEquals("other", tfq.getAnswer());
		
		
		
	}

}
