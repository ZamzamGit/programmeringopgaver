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
            liste[i] = ingredients.get(i).toString();
        }
        return liste;
    }

    @Override
    public String getIngredientName(int id) {
        for (int i = 0; i < ingredients.size(); i++)
            if (ingredients.get(i).id == id)
                return ingredients.get(i).name;
        return null;
    }

    @Override
    public int getIngredientAmount(int id) {
        return ingredients.get(id).amount;
    }

    @Override
    public void setIngredientName(int id, String name) {
        ingredients.get(id).name = name;
    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        ingredients.get(id).amount = amount;
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id, name, amount));
    }
}
