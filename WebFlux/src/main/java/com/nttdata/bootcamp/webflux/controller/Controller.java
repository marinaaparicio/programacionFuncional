package com.nttdata.bootcamp.webflux.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class Controller {
	
	@GetMapping(path = "/numbers", produces = "text/event-stream")
		public Flux<Integer> numbers(){
		
		
		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
		
		
		flux.subscribe(m->System.out.println("Consumer 1. Received:" + m),
				e->System.out.println("Consumer 1. Error:"+e.getMessage()),
				()->System.out.println("Consumer 1. Completed"));
			
		
		flux.subscribe(m->System.out.println("Consumer 2. Received:" + m),
				e->System.out.println("Consumer 2. Error:"+e.getMessage()),
				()->System.out.println("Consumer 2. Completed"));
			return flux;
		
		}
	
	
	
	}

	


