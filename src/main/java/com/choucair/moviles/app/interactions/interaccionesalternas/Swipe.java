package com.choucair.moviles.app.interactions.interaccionesalternas;

import com.choucair.moviles.app.interactions.interaccionesalternas.swipe.SwipeBuilderFrom;
import net.serenitybdd.screenplay.Actor;

public class Swipe {
	
	public static SwipeBuilderFrom as (Actor actor) {
		return new SwipeBuilderFrom(actor);
	}
}
