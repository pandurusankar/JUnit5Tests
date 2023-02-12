package VarArgumentsTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class VarArgumentsProviderTest {

	public VarArgumentsProviderTest() {
		// TODO Auto-generated constructor stub
	}
	
	@ParameterizedTest
	@ArgumentsSource(VarArgumentsPRovider.class)
	void isBlank_ShouldReturnTrueforNullOrBlankStringArgProvider(String input, Integer i) {
		assertTrue(i instanceof Integer);
//		assertTrue(input.isBlank());
	}

}
