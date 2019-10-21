package Lab4.Calculator;

public class LogicalOP {

    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    //               FOR
    //Write a java program to count
    //backwards from a given number
    //to a lower given number

    //Write a program called sumAndAverage to
    //produce the sum of 1, 2, 3, .... to 100.
    //Also compute and display the average.
    //....................................
    //                WHILE
    //Write a program to sum only the odd numbers
    //from 1 to 100, and compute the average.

    //Write a program to sum those numbers from 1
    //to 100 that is divisible by 7,
    //and compute the average.

    public void countBackwards(int high, int low){
        for (int i = high; i>=low;i--) {
            System.out.println(i);

        }
    }
    public float sumAndAverage(){
        float sum=0;
        int counter=0;
        for (int i = 1; i <= 100; i++){
            sum=sum+i;
            counter+=1;
        }
    return(sum / counter);
    }




    }










    //Given a text input, if it is "FastTrack",
    //then print "learning text comparison".
    //If not, print "Got to try some more"


    //Given a number, if it's equal to or higher than 2
    // and equal to or lower than 8, print number







