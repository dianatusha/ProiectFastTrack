package Lab3.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("The result of the sum is " +calc.sum(8,9));
        System.out.println("The result of the substraction is " +calc.substract(8,5));
        System.out.println("The result of the multiplication is " +calc.multiply(98,54));
        System.out.println("The result of the division is " +calc.division(95,5));

        LogicalOP op=new LogicalOP();
        System.out.println("The bigger number is: "+ op.checkBiggerNumber(5,7));
        op.textComparison("alabalaportocala", "Fasttrack");
        op.textAndNumber("FastTrackIT",2);
        op.textAndNumber("Alabalaportocala",7);
        op.snowForcast(9);
        op.theNumberis(8);
        op.theNumberis(4);
        op.theNumberis(2);

        op.showNumber(50);

        System.out.println(op.isNumberEven(6));
        System.out.println(op.isNumberEven(7));

        System.out.println(op.isEligibleToVote(3));
        System.out.println(op.isEligibleToVote(29));
        System.out.println(op.showBiggerNumber(3,3,2));


        



    }






    }


