package Lab3.Calculator;

import org.w3c.dom.ls.LSOutput;

public class LogicalOP {
        int checkBiggerNumber(int first, int second){
                if(first>second){
                     return first;
                }else{
                        return second; }

        }

        void textComparison(String first, String second) {
            if (first.equals(second)) {
                System.out.println("Sunt la fel");
            } else  {
                System.out.println("Nu sunt la fel");
            }
        }

        void textAndNumber(String x, int y){
            if (x.equals("FastTrackIT")&& y<=3)
                System.out.println(x+" "+y);
            else if (x!=("FastTrackIT")&& y>=4)
                System.out.println(y+" "+x);
        }

        void snowForcast(int x){
            if (x>8 || x==6)
                System.out.println("The forecast snow is(cm):" + x);
        }








}
















    //Given a text input, if it is "FastTrack",
    //then print "learning text comparison".
    //If not, print "Got to try some more"


    //Given a number, if it's equal to or higher than 2
    // and equal to or lower than 8, print number







