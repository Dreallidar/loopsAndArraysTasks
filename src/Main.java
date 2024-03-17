import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~Task 1~~~~~~~~~~~~~");


        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }
        System.out.println("~~~~~~~~~~~~~~~~~Task 2~~~~~~~~~~~~~~~");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~Task 3~~~~~~~~~~~~~~~~~~");

        String[] augalai = new String[10];
        augalai[0] = "Berzas";
        augalai[1] = "Azuolas";
        augalai[2] = "Obelis";
        augalai[3] = "Pusis";
        augalai[4] = "Egle";
        augalai[5] = "Zibute";
        augalai[6] = "Roze";
        augalai[7] = "Piene";
        augalai[8] = "Tabakas";
        augalai[9] = "Marichuana";
        System.out.println(augalai[2]);

        System.out.println("~~~~~~~~~~~~~~~~Task 4~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < augalai.length; i++) {
            System.out.println(augalai[i]);
        }

        System.out.println("~~~~~~~~~~~~~~~~Task 5~~~~~~~~~~~~~~~~~~");

        for (int i = 9; i < augalai.length; i--) {
            System.out.println(augalai[i]);
            if (i == 0) {
                break;
            }

        }
        System.out.println("~~~~~~~~~Task 5 Alternative~~~~~~~~~~");

        for (int i = augalai.length - 1; i >= 0; i--) {
            System.out.println(augalai[i]);
        }

        System.out.println("~~~~~~~~~~~~~~Task 6 ~~~~~~~~~~~~");

        System.out.println();

        for (int y = 10; y <= 50; y += 2) {
            System.out.println(y);

        }
        System.out.println("~~~~~~~~Task 7~~~~~~~~~~~~~~~~");

        for (int y = 10; y <= 50; y += 2) {
            if (y == 10) {
                continue;
            }
            if (y == 20) {
                continue;
            }
            if (y == 30) {
                continue;
            }
            if (y == 40) {
                continue;
            }
            if (y == 50) {
                continue;
            }

            System.out.println(y);

        }
        System.out.println("~~~~~~task 7 B variation~~~~~~~~~~~");
        for (int y = 10; y <= 50; y += 2) {
            if (y != y % 10) {
                continue;
            }
            System.out.println(y);

        }
        System.out.println("~~~~~~~~~~Task 8~~~~~~~~~~");

        int count = -1;
        for (int i = 0; i <= 20; i++) {


            System.out.println(i);
            if (i % 2 == 0) count++;

        }
        System.out.println("Kintamasis i buvo porinis " + count + " Kartu ");


        System.out.println("~~~~~~~~~Task 9~~~~~~~~~");

        int shorter = 0;
        int longer = 0;


//        System.out.println(shorter + " " + longer);

        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() > 7) longer++;
            if (augalai[i].length() < 5) shorter++;

        }
        System.out.println("trumpesniu nei 5 yra " + shorter + " Ilgesniu nei 7 yra  " + longer);

        System.out.println("~~~~~~~~~~~ Task 10 ~~~~~~~~~~~~~~~~~~~~");
        int between = 0;
        for (int i = 0; i < augalai.length; i++) {
            if (augalai[i].length() > 5 && augalai[i].length() < 10) between++;
        }
        System.out.println("Ilgiai tarp 5 ir 10 simboliu " + between);

        System.out.println("~~~~~~All Easy tasks completed~~~~~");

        System.out.println("~~~~~~~~~~~~~ 1st Hard Task~~~~~~~");

        int max = 300;

        String count2 = "";
        int count150 = 0;
        for (int i = 0; i <= 300; i++) {
            int rng = (int) (Math.random() * max);
            if (rng > 150) count150++;
            if (rng > 275) {
                count2 += "[" + rng + "] " ;

            }else {
                count2 += rng + " ";

            }


        }
        System.out.println(count2);
        System.out.println(" ");
        System.out.println(count150 + " Skaiciu Virs 150");


    }

}