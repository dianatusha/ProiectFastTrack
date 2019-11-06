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

void theNumberis(int x){
            if(x>3)
                System.out.println("The number is greater than 3 and not equal to 4");
            if(x==4)
                System.out.println("The number is equal to 4");
            if(x<3)
                System.out.println("The number is lower than 3");
}



}






}
























