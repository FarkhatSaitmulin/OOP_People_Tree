import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DowloadData data = new DowloadData();
        FamilyTree familyIvanov = new FamilyTree();

        Human motherIvanov = new Human("Мария", Gender.female, LocalDate.of(1978,4,9));
        Human fatherIvanov = new Human("Иван", Gender.male, LocalDate.of(1980,2,11));
        Human childIvanov1 = new Human("Петр", motherIvanov, fatherIvanov, Gender.male, LocalDate.of(2003,8,27),null);
        Human childIvanov2 = new Human("Алиса", motherIvanov, fatherIvanov, Gender.female, LocalDate.of(2004,7,22),null);
        Human childIvanov3 = new Human("Костя", motherIvanov, fatherIvanov, Gender.male, LocalDate.of(2005,1,9),null);
        Human childIvanov4 = new Human("Саша", null, childIvanov3, Gender.male, LocalDate.of(2007,11,18),null);

        familyIvanov.addHuman(motherIvanov);
        familyIvanov.addHuman(fatherIvanov);
        familyIvanov.addHuman(childIvanov1);
        familyIvanov.addHuman(childIvanov2);
        familyIvanov.addHuman(childIvanov3);
        familyIvanov.addHuman(childIvanov4);


        data.save(familyIvanov, "familyIvanov.bin");



        FamilyTree familySidorov = new FamilyTree();

        Human motherSidorov = new Human("Жанна", Gender.female,LocalDate.of(1968,7,10));
        Human fatherSidorov = new Human("Жорж", Gender.male,LocalDate.of(1969,6,12));
        Human childSidorov = new Human("Николай", motherSidorov, fatherSidorov, Gender.male, null, null);
        familySidorov.addHuman(motherSidorov);
        familySidorov.addHuman(fatherSidorov);
        familySidorov.addHuman(childSidorov);



        data.save(familySidorov, "familySidorov.bin");

        FamilyTree familyPupkin = new FamilyTree();

        Human motherPupkin = new Human("Валентина", Gender.female,LocalDate.of(1968,7,10));
        Human fatherPupkin = new Human("Николай", Gender.male,LocalDate.of(1968,5,5));
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
//        System.out.println(family2);
//        System.out.println(family3);

        family1.getHumanList().sort(new ComparatorByName());
        System.out.println(family1);
        family1.getHumanList().sort(new ComparatorByBirthday());
        System.out.println(family1);


    }

}