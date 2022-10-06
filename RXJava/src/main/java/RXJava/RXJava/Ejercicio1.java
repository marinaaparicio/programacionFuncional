package RXJava.RXJava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Ejercicio1 {

	public Ejercicio1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Observable<String> messageSender = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
	    
		messageSender.subscribe(new Observer<String>() {
	
		        public void onSubscribe(Disposable d) {
		            System.out.println("Observer. Subscribed.");
		        }

		
		        public void onNext(String s) {
		            System.out.println("Observer. Received: " + s);
		        }

		    
		        public void onError(Throwable e) {
		            System.out.println("Observer. Error: " + e.getMessage());
		        }

		    
		        public void onComplete() {
		            System.out.println("Observer. Completed");
		        }
		    });
	}

}
