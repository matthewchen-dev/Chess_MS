package Game.Rules;

public class Turns {

    public static boolean p1;//white
    public static boolean  p2;//black

    public static int turns = 1; //odd == white; even == black;


    public Turns() {
        //turns
        while(true) {


            System.out.println("");
            if (turns % 2 != 0) {//p1 turn

                p1 = true;
                p2 = false;

            } else {//p2 turn

                p2 = true;
                p1 = false;

            }


        }

    }


}
