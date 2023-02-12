package VarArgumentsTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class VarArgumentsPRovider implements ArgumentsProvider{

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
		// TODO Auto-generated method stub
		return Stream.of(
				Arguments.of((String) null, 20),
				Arguments.of("", 30),
				Arguments.of(" ", 40)
				);
	}

}
