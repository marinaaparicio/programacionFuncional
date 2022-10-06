package programacionFuncional.Ejercicio1;
import java.util.List;

public class Imperativa {

	public static void main(String[] args) {
	
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

		int count = 0;
		for (Integer integer : numbers) {
			
			if(integer > 10) {
				
				count++;
				
			}
		}

		System.out.println(count);

	}

}
