package Game.States;

public class Players {

    public static boolean p1;//white
    public static boolean  p2;//black

    public static int turns = 1; //odd == white; even == black;


    public Players() {
        //turns
        while (true) {

            System.out.println(turns);
            if (turns % 2 != 0) {

                p1 = true;
                p2 = false;
            } else {

                p2 = true;
                p1 = false;
            }
        }

    }


}
