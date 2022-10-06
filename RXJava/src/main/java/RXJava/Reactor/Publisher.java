package RXJava.Reactor;

import io.reactivex.functions.Consumer;
import reactor.core.publisher.Flux;

public class Publisher {

	public Publisher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		
		Flux<String> messageSender = Flux.just("Mensaje1", "Mensaje2", "Mensaje3");

		messageSender.subscribe(m->System.out.println("Consumer. Received:" + m),
				e->System.out.println("Consumer. Error:"+e.getMessage()),
				()->System.out.println("Consumer. Completed"));
		
	}

}
