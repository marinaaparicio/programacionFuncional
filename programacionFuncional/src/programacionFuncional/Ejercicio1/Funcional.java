package programacionFuncional.Ejercicio1;
import java.util.List;

class Funcional {


	public static void main(String[] args) {
	
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		System.out.println(numbers.stream().filter(number -> number > 10).count());
	}

}
