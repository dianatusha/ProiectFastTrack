package Lab4.Calculator;

public class Main {

    public static void main(String[] args) {
        LogicalOP op = new LogicalOP();
        System.out.println(op.verifyText("FastTrack"));

        op.countBackwards(98,4);
        System.out.println(op.sumAndAverage());
    }




}
