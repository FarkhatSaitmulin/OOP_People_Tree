package ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;
    private Human human;

    @Override
    public void start() {

        scanner = new Scanner(System.in);
        menu = new Menu(this);
        work = true;
        human = new Human();

        while (work) {
            System.out.println(menu.printMenu());
            System.out.print("--> ");
            String command = scanner.nextLine();

            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            } else {
                System.out.println("что-то пошло не так");
            }
        }
    }

    //    public Human getValueOfHUman() {
//        System.out.println("Введите данные для нового человека в формате имя мать отец дети: ");
//        String[] arr = scanner.nextLine().split(" ");
//        human.setName(arr[0]);
//        human.setMother(new Human());
//        human.setFather(new Human());
//        human.setChildren(new ArrayList<Human>());
//        return human;
//    }
    private boolean checkInput(String text) {

        return text.matches("[0-9]+");
    }

    @Override
    public void print(String text) {

        System.out.println(text);
    }

    @Override
    public void setPresenter(Presenter presenter) {

        this.presenter = presenter;
    }

    public void finish() {
        work = false;
    }
}