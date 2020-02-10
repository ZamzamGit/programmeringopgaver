package simple_to_lags_model;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Data implements IData {

    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "[" + id + ", " + name + ", " + amount + "]";
        }
    }

    private List<Ingredient> ingredients;

    public Data() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "smør", 185));
    }

    @Override
    public String[] getAllIngredients() {
        String[] liste = new String[ingredients.size()];
        for (int i = 0; i < liste.length; i++) {
        }
        return liste;
    }

    @Override
    public String getIngredientName(int id) {

    }

    @Override
    public int getIngredientAmount(int id) {
        return 0;
    }

    @Override
    public void setIngredientName(int id, String name) {

    }

    @Override
    public void setIngredientAmount(int id, int amount) {

    }

    @Override
    public void createIngredient(int id, String name, int amount) {

    }
}
