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
}
}