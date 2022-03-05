package refactoring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSamples {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("gopi", "krishna", "venkata");
		List<Boolean> mapfunction = list.stream().map(m -> m.equalsIgnoreCase("gopi")).collect(Collectors.toList());
		System.out.println(mapfunction);
		List<String> filterfunction = list.stream().filter(m -> m.equalsIgnoreCase("gopi")).collect(Collectors.toList());
		System.out.println(filterfunction);

	}

}
