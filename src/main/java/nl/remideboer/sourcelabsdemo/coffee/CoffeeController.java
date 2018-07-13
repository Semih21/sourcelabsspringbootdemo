package nl.remideboer.sourcelabsdemo.coffee;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
class CoffeeController { /// package by feature alles default, encapsulatie inc packages

	private List<Coffee> list;

	CoffeeController() {
		list = new ArrayList<>();
		list.add(new Coffee(1, "Filter", 1.59));
		list.add(new Coffee(2, "Cappucino", 2.40));
		list.add(new Coffee(3, "Espresso", 2.10));
	}

	@RequestMapping(value = "/coffee", method = RequestMethod.GET)
	List<Coffee> listCoffee() {
		return list;
	}

	@RequestMapping(value = "/coffeeflux", method = RequestMethod.GET)
	Flux<Coffee> fluxCoffee() {
		Flux<Coffee> fluxList = Flux.fromIterable(list);
		return fluxList;
	}

	@RequestMapping(value = "/coffeemono", method = RequestMethod.GET)
	Mono<Coffee> monoCoffee() {
		Mono<Coffee> justOne = Mono.just(list.get(0));// ok dan nemen we even aan dat deze echt aanwezig is

		return justOne;
	}

}
