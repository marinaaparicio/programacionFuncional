package programacionFuncional.Ejercicio2;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class ListaProductos {

	public ListaProductos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Product> shoppingCart = List.of(
				
				new Product ("Clothes", 15.90, Tax.NORMAL),
				new Product ("Bread", 1.5, Tax.SUPERREDUCED),
				new Product ("Meat", 13.99, Tax.REDUCED)
				);
		
		
		
		Optional<Double> precioTotal = shoppingCart.stream().map(product -> product.price + ((product.price * product.tax.percent) / 100)).reduce((x, y) -> x + y);
		
		System.out.println("Precio total: " + precioTotal);

		
		
		String ordenar = shoppingCart.stream().filter(x -> x.name.startsWith("C")).sorted((x, y) -> x.name.compareToIgnoreCase(y.name)).map(x -> x.name).collect(Collectors.joining(", ", "Empiezan por C: ", "." ));
		
		System.out.println(ordenar);
		
		
		
		Optional<Double> precioTotalMenor10 = shoppingCart.stream().filter(product -> product.price > 10).map(product -> product.price + ((product.price * product.tax.percent) / 100)).reduce((x, y) -> x + y);
		
		System.out.println("Precio total menor 10: " + precioTotalMenor10);
	}

}
