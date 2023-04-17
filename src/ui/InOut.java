package ui;

import ui.FamilyTree;

public interface InOut {
    void save(FamilyTree f, String s);
    FamilyTree load(String s);
}
