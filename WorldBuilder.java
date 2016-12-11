import kareltherobot.*;
/**
 * * A class with lots of static methods for drawing different patterns
 * * of Beepers into a Karel World.  *
 * * Partner 1: Ryan H
 * * Partner 2: Ryan B
 * * Problems Completed: 1,
 * */
public class WorldBuilder{
    /**
     * *Draws a horizontal row of beepers across the middle street
     * *of the World.
     * */
    //street = y
    //ave = x
    public static void pattern1(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=1; i<=ave; i++){
            World.placeBeepers(street/2, i, 1);
        }
    }

    //street = y
    //ave = x
    public static void pattern2(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=1; i<=ave; i++){
            World.placeBeepers(i, ave/2, 1);
        }
    }
    //street = y
    //ave = x
    public static void pattern3(int rows, int cols){
        System.out.println("ryan B");
    }

    //street = y
    //ave = x
    public static void pattern4(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=street;i>0;i--){
            World.placeBeepers(i,i,1);
        }
    }

    //street = y
    //ave = x
    public static void pattern5(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=1;i<=ave; i++){
            World.placeBeepers(street+1-i,i,1);
        }
    }
    //street = y
    //ave = x
    public static void pattern6(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=1;i<=ave; i++){
            World.placeBeepers(street+1-i,i,1);
            if(ave%2!=0){if(i!=street/2+1) World.placeBeepers(i,i,1);}
            else World.placeBeepers(i,i,1);
        }
    }
    public static void pattern7(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=1;i<=ave; i++){
            for(int j=1;j<=street;j++){
                if(i==j);
                else World.placeBeepers(j,i,1);
            }
        }
    }
    public static void pattern8(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=1;i<=ave;i++){
            for(int j=1;j<=street;j++){
                if(i==j||i+j==street);
                else World.placeBeepers(j,i,1);
            }
        }
    }
    public static void pattern9(int rows, int cols){
        System.out.println("ryan B");
    }
    public static void pattern10(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=0;i<=ave/2;i++){
            World.placeBeepers(2*i-2,i,1);
            World.placeBeepers((2*i-2)+1,i,1);
            World.placeBeepers(2*i,ave-i,1);
            World.placeBeepers((2*i)+1,ave-i,1);
        }
        World.placeBeepers(street,(ave/2)+1,1);
    }
    public static void pattern11(int street, int ave){

    }
    public static void pattern12(int street, int ave){
        World.reset();
        World.setSize(street, ave);
        World.setVisible(true);
        for(int i=1;i<=ave;i++){
            if(i==1||i==ave);
            else{
                World.placeBeepers((ave/2)+i,i,1);
            }World.placeBeepers((ave/2)-i+2,i,1);
            if(i!=street/2+1) {
                World.placeBeepers((ave/2)+i,ave-i+1,1);
                World.placeBeepers((ave/2)-i+2,ave-i+1,1);
            }
        }
    }
}
