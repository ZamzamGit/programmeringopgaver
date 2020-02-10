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

        System.out.println("\nAvailable actions:\n press:");
        System.out.println("0 - to shutdown\n");
        System.out.println("1 - to print contacts\n");
        System.out.println("2 - to add a new contact\n");
        System.out.println("3 - to update an existing contact \n");
        System.out.println("4 - remove an existing contact \n");
        System.out.println("5 - query if an existing contact exists \n");
        System.out.println("6 - to print af list of available actions \n");
        System.out.println("Choose your actions: ");
    }

    @Override
    public void showIngredients() {
    }



    @Override
    public void showIngredient() {

    }

    @Override
    public void changeIngredient() {

    }

    @Override
    public void createIngredient() {
    }
}
