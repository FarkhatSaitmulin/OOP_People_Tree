package ui;

public class Presenter {
    public View view;
    public FamilyTree<Human> family;
    private Human human;

    public Presenter(View view, FamilyTree<Human> family) {
        this.view = view;
        view.setPresenter(this);
        this.family = family;
        human = new Human();
    }

//    public void ButtonClick () {
//        human = view.getValueOfHUman();
//        family.addHuman(human);
//        view.print();
//    }


}
