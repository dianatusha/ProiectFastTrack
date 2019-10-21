package Lab4.AnimalRescue;

public class AppMain {
    public static void main(String[] args){
        Cat firstcat=new Cat();
        System.out.println(firstcat.age);
        System.out.println(firstcat.breed);
        System.out.println(firstcat.color);
        System.out.println(firstcat.gender);
        System.out.println(firstcat.name);
        System.out.println(firstcat.weight);
        firstcat.eat();
        firstcat.jump();
        firstcat.miau();
        firstcat.purr();

        Dog firstdog=new Dog();
        System.out.println(firstdog.age);
        System.out.println(firstdog.weight);
        System.out.println(firstdog.breed);
        System.out.println(firstdog.color);
        System.out.println(firstdog.gender);
        System.out.println(firstdog.name);
        firstdog.eat();
        firstdog.bark();
        firstdog.cry();
        firstdog.run();
    }

}
