import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests {
    @Test 
	public void testFilter1() {
        List<String> input1 = new ArrayList<>(3);
        input1.add("Hi");
        input1.add("ILoveYou");
        input1.add("Bye");
        List<String> result = new ArrayList<>();
        result.add("Hi");
        result.add("Bye");
        StringChecker sc = new myStringChecker();
        assertEquals(result, ListExamples.filter(input1, sc));;
	}

}
