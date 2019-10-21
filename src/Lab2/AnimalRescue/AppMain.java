package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args){
        Cat firstcat=new Cat();
        System.out.println(firstcat.name);
        System.out.println(firstcat.age);
        System.out.println(firstcat.favoriteActivity);
        System.out.println(firstcat.favoriteFood);
        System.out.println(firstcat.levelOfHealt);
        System.out.println(firstcat.levelOfHunger);
        System.out.println(firstcat.levelOfMood);

        Dog firstdog=new Dog();
        System.out.println(firstdog.name);
        System.out.println(firstdog.age);
        System.out.println(firstdog.favoriteActivity);
        System.out.println(firstdog.favoriteFood);
        System.out.println(firstdog.levelOfHealt);
        System.out.println(firstdog.levelOfHunger);
        System.out.println(firstdog.levelOfMood);

        Horse firsthorse=new Horse();
        System.out.println(firsthorse.name);
        System.out.println(firsthorse.age);
        System.out.println(firsthorse.favoriteActivity);
        System.out.println(firsthorse.favoriteFood);
        System.out.println(firsthorse.levelOfHealt);
        System.out.println(firsthorse.levelOfHunger);
        System.out.println(firsthorse.levelOfMood);

        Veterinarian firstvet=new Veterinarian();
        System.out.println(firstvet.name);
        System.out.println(firstvet.specializatin);

        AnimalFood firstfood=new AnimalFood();
        System.out.println(firstfood.name);
        System.out.println(firstfood.amount);
        System.out.println(firstfood.availability);
        System.out.println(firstfood.price);

        RecreationalActivity firstrec=new RecreationalActivity();
        System.out.println(firstrec.name);

        Adopter firstadopter=new Adopter();
        System.out.println(firstadopter.name);
        System.out.println(firstadopter.amountOfMoney);








    }


}
