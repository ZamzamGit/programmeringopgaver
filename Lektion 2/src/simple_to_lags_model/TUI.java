package simple_to_lags_model;

import java.util.Scanner;

public class TUI implements IUI {

    Data d;
    Scanner scanner;

    public TUI(Data d) {
        this.d = d;
        scanner = new Scanner(System.in);
    }

    @Override
    public void showMenu() {

        System.out.println("Mulige handlinger");
        System.out.println("1 - for at vise alle ingredientser  \n");
        System.out.println("2 - for at vise en ingrediens \n");
        System.out.println("3 - for at ændre en ingrediens\n");
        System.out.println("4 - for at oprette en ny ingrediens \n");
        System.out.println("5 - for at afslutte programmet  \n");

        System.out.println("Choose your actions: ");

        boolean quit = false;
        while (!quit) {
            int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        showIngredients();
                        break;
                    case 2:
                        showIngredient();
                        break;
                    case 3:
                        changeIngredient();
                        break;
                    case 4:
                        createIngredient();
                        break;
                    case 5:
                        quit = true;
                        break;
                    default:
                        showMenu();
                }
            }
        }

    @Override
    public void showIngredients() {
        System.out.println("Liste af ingredienser");
        for (String s: d.getAllIngredients()) {
            System.out.println(s);
        }
    }


    @Override
    public void showIngredient() {
        System.out.println("Indtast id for ingredients");
        int id = scanner.nextInt();
        String ingredient = d.getIngredientName(id);
        System.out.println(ingredient);
    }

    @Override
    public void changeIngredient() {
        System.out.println("Indtast id for det ingredient du vil ændre");
        int id = scanner.nextInt();
        System.out.println("Du vil ændre i " + d.getIngredientName(id) + ", indtast det nye navn");
        String name = scanner.nextLine();
        d.setIngredientName(id, name);
        System.out.println("Indtast mængde");
        int amount = scanner.nextInt();
        d.setIngredientAmount(id, amount);
        System.out.println("Du har ændret id " + id + " " + "til ingrediensen " +
                d.getIngredientName(id) + ", med en mængde på " + d.getIngredientAmount(id));
    }

    @Override
    public void createIngredient() {
        System.out.println("Indtast id");
        int id = scanner.nextInt();
        System.out.println("Indtast navn");
        String name = scanner.nextLine();
        System.out.println("Indtast mængde");
        int amount = scanner.nextInt();
        d.createIngredient(id, name, amount);
    }
}
