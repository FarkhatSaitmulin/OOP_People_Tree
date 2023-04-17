package ui;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human implements Serializable {

    //    public Presenter presenter;
    private String name;
    private Human mother;
    private Human father;
    private List<Human> children;


    public Human(String name, Human mother, Human father,
                 Gender sex, LocalDate birthday, LocalDate deathDate) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();

    }

    public Human(String name, Gender sex, LocalDate birthday) {
        this.name = name;
//        this.sex = sex;
//        this.birthday = birthday;
        children = new ArrayList<>();
    }

    public Human () {
    }

    public String getName() {
        return name;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("имя: ");
        sb.append(name);
        sb.append(" ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        sb.append(" ");
//        sb.append(birthday);
        return sb.toString();
    }

    public String getMotherInfo() {
        String res = "мать: ";
        if (mother != null) {
            res += mother.getName();
        } else {
            res += "неизвестна";
        }
        return res;
    }

    public String getFatherInfo() {
        String res = "отец: ";
        if (father != null) {
            res += father.getName();
        } else {
            res += "неизвестен";
        }
        return res;
    }

    public String getChildrenInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("дети: ");
        if (children != null) {
            if (children.isEmpty()) {
                sb.append("детей нет ");
                return sb.toString();
            }

            for (Human item : children) {
                sb.append(item.getName());
                sb.append(", ");
            }

        } else {
            sb.append("детей нет ");
        }

        return sb.toString();
    }

    public void addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}