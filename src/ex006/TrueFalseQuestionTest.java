package ex006;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

import junit.framework.TestCase;

public class TrueFalseQuestionTest extends TestCase {

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
		tfq.setText("Albert Einstein was the inventer of Java.");
		tfq.setAnswer("true");
		assertEquals(false, tfq.checkAnswer("f"));

		tfq.setText("The original name for Java was Oak.");
		tfq.setAnswer("false");
		assertEquals(false, tfq.checkAnswer("t"));

	}
	
}
