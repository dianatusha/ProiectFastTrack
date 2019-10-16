package Lab2;

public class Main {

    public static void main(String[] args) {
        int x=1;
        int y=2;
        float result=sum(x,y);
        System.out.println(result);
        result=substract(x,y);
        System.out.println(result);
        result=division(x,y);
        System.out.println(result);
        result=multiply(x,y);
        System.out.println(result);
        myName();
        java();
        face();





    }
public static int sum(int first, int second) {
        int sum=first+second;
        return sum;
    }
    public static int substract(int first, int second){
        int rez=first-second;
        return rez;
}
public static float division(float first, float second){
        float rez=first/second;
        return rez;
}
public static int multiply(int first, int second){
        int rez=first*second;
        return rez;
}
public static void myName(){
    System.out.println("Hello \n Diana");
}

public static void java(){
    System.out.println("   J    a   v     v  a");
    System.out.println("   J   a a   v   v  a a");
    System.out.println("J  J  aaaaa   v v  aaaaa");
    System.out.println(" JJ  a     a   v  a     a");
}

public static void face(){
    System.out.println(" +\"\"\"\"\"+");

    System.out.println("[| o o |]");
    System.out.println(" |  ^  |");
    System.out.println(" | '_' |");
    System.out.println(" +-----+");
}
public static int rest(int first,int second){
        return first%second;

}


}
