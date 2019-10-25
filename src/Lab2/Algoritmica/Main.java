package Lab2.Algoritmica;

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
        result=rest(x,y);
        System.out.println(result);

        System.out.println(gradeCelsius(100));
        System.out.println(transformInchinmeters(68));

        speed(76,90,876,96);







    }
public static int sum(int first, int second) {
        int sum=first+second;
        return sum;
    }
    public static int substract(int first, int second){
        int substraction=first-second;
        return substraction;
}
public static float division(float first, float second){
        float division=first/second;
        return division;
}
public static int multiply(int first, int second){
        int multiplication=first*second;
        return multiplication;
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
public static int rest(int first,int second){ ;
        int rez=first%second;
        return rez;
}
public static float gradeCelsius(float fahrenheit){
        float celsius=(fahrenheit-32)*5/9;
        return celsius;
}
public static double transformInchinmeters(double inch){
        double meters=inch*0.0254;
        return meters;
}
//9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul
// (ca si 3 numere: ore, minute, secunde), si afiseaza viteza,
// in metrii pe secunda,
// kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)

    public static void speed(float meters, float hours, float minutes, float seconds) {
float timehours=hours + minutes/60 + seconds/3600;
float timeseconds=hours*3600 + minutes*60 + seconds;
float km=meters/1000;
float miles=meters/1609;
float ms=meters/timeseconds;
float kmh=km/timehours;
float mlh=miles/timehours;

        System.out.println("The speed in m/s is:" + ms + "\n" + "The speed in km/h is:"
                + kmh + "\n" + "The speed in miles/h is:" + mlh);
}



}
