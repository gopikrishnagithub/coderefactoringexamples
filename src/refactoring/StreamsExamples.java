package refactoring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("gopi", "krishna", "venkata");
		List<String> names = list.stream().filter(f -> f.length() > 3).collect(Collectors.toList());
		if (names.size() > 0) {
			for (String name : names) {
				System.out.println(name);
			}
		} else {
			System.out.println("list size is 0");
		}
	}

}
