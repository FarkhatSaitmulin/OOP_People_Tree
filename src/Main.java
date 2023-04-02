import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DowloadData data = new DowloadData();
        FamilyTree familyIvanov = new FamilyTree();

        Human motherIvanov = new Human("Мария", Gender.female);
        Human fatherIvanov = new Human("Иван", Gender.male);
        Human childIvanov1 = new Human("Петр", motherIvanov, fatherIvanov, Gender.male, null, null);
        Human childIvanov2 = new Human("Алиса", motherIvanov, fatherIvanov, Gender.female, null, null);
        Human childIvanov3 = new Human("Костя", motherIvanov, fatherIvanov, Gender.male, null, null);
        Human childIvanov4 = new Human("Саша", null, childIvanov3, Gender.male, null, null);

        familyIvanov.addHuman(motherIvanov);
        familyIvanov.addHuman(fatherIvanov);
        familyIvanov.addHuman(childIvanov1);
        familyIvanov.addHuman(childIvanov2);
        familyIvanov.addHuman(childIvanov3);
        familyIvanov.addHuman(childIvanov4);


        data.save(familyIvanov, "familyIvanov.bin");



        FamilyTree familySidorov = new FamilyTree();

        Human motherSidorov = new Human("Жанна", Gender.female);
        Human fatherSidorov = new Human("Жорж", Gender.male);
        Human childSidorov = new Human("Николай", motherSidorov, fatherSidorov, Gender.male, null, null);
        familySidorov.addHuman(motherSidorov);
        familySidorov.addHuman(fatherSidorov);
        familySidorov.addHuman(childSidorov);



        data.save(familySidorov, "familySidorov.bin");

        FamilyTree familyPupkin = new FamilyTree();

        Human motherPupkin = new Human("Валентина", Gender.female);
        Human fatherPupkin = new Human("Николай", Gender.male);
        Human childPupkin = new Human("Елисей", motherPupkin, fatherPupkin, Gender.male, null, null);
        familyPupkin.addHuman(motherPupkin);
        familyPupkin.addHuman(fatherPupkin);


        familyPupkin.addHuman(childPupkin);


        data.save(familyPupkin, "familyPupkin.bin");

        FamilyTree family1 = new FamilyTree();
        FamilyTree family2 = new FamilyTree();
        FamilyTree family3 = new FamilyTree();

        family1 = data.load("familyIvanov.bin");
        family2 = data.load("familySidorov.bin");
        family3 = data.load("familyPupkin.bin");

        System.out.println(family1);
        System.out.println(family2);
        System.out.println(family3);


    }

}