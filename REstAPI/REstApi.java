import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		ObjectMapper ObjectMapper = new ObjectMapper ();

		SomeData SomeData = new SomeData ();
		// Перед этим создать класс с геттерами и сеттерами и конструкторами
		
		someData.setParam1(100);
		someData.setParam2(true);
		someData.setParam1("Что-то");

		// Преобразование в строку JSON 
		String result = objectMapper.writeValueAsString(someData);
		System.out.println(result);

	}
}
