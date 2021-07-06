package ac.uk.qub.tacos.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ac.uk.qub.tacos.Ingredient;
import ac.uk.qub.tacos.Ingredient.Type;


@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{
	
	private Map<String, Ingredient> ingredientMap = new HashMap<>();
	
	public IngredientByIdConverter() {
		ingredientMap.put("FLTO", 
				new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
		
	}

	@Override
	public Ingredient convert(String id) {
		
		return ingredientMap.get(id);
	}

}
