import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static <K, V> K getKey(Map<K, V> map, V value) {
		return map.keySet().stream().filter(key -> value.equals(map.get(key))).findFirst().get();
	}

	public static void main(String[] args) {

		System.out.println("Welcome to polish-english dictionary with colors!");

		Map<String, String> dictionaryWords = new HashMap<>();
		dictionaryWords.put("white", "biały");
		dictionaryWords.put("black", "czarny");
		dictionaryWords.put("orange", "pomarańczowy");
		dictionaryWords.put("yellow", "żółty");
		dictionaryWords.put("blue", "niebieski");
		dictionaryWords.put("red", "czerwony");
		dictionaryWords.put("purple", "fioletowy");
		dictionaryWords.put("grey", "szary");
		dictionaryWords.put("green", "zielony");
		dictionaryWords.put("brown", "brązowy");
		dictionaryWords.put("pink", "różowy");

		Scanner scan = new Scanner(System.in);

		while (true) {
			try {

				String input = scan.nextLine();

				if (dictionaryWords.containsValue(input)) {
					System.out.println(getKey(dictionaryWords, input));

				}

				else {
					System.out.println("is it color for sure?");
				}

				if (input.equals("stop")) {
					System.out.println("Thank You, bye!");
				}

			} catch (Exception e) {
				System.out.println("Try with another");
			}

		}

	}
}