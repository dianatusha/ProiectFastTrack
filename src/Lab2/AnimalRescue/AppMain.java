package Lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args){
        Cat firstcat=new Cat();
        firstcat.setName("Mihaela");
        System.out.println(firstcat.getName());
        firstcat.setAge(4f);
        System.out.println(firstcat.getAge());
        firstcat.setFavoriteActivity("playing with the ball");
        System.out.println(firstcat.getFavoriteActivity());
        firstcat.setFavoriteFood("Sheeba");
        System.out.println(firstcat.getFavoriteFood());
        firstcat.setLevelOfHealt(8);
        System.out.println(firstcat.getLevelOfHealt());
        firstcat.setLevelOfHunger(7);
        System.out.println(firstcat.getLevelOfHunger());
        firstcat.setLevelOfMood(7);
        System.out.println(firstcat.getLevelOfMood());

        Dog firstdog=new Dog();
        firstdog.setName("Zero");
        System.out.println(firstdog.getName());
        firstdog.setAge(4.5f);
        System.out.println(firstdog.getAge());
        firstdog.setFavoriteActivity("running");
        System.out.println(firstdog.getFavoriteActivity());
        firstdog.setFavoriteFood("Bones");
        System.out.println(firstdog.getFavoriteFood());
        firstdog.setLevelOfHealt(8);
        System.out.println(firstdog.getLevelOfHealt());
        firstdog.setLevelOfHunger(3);
        System.out.println(firstdog.getLevelOfHunger());
        firstdog.setLevelOfMoodtLevelOfMood(8);
        System.out.println(firstdog.getLevelOfMood());

        Horse firsthorse=new Horse();
        firsthorse.setName("Zorana");
        System.out.println(firsthorse.getName());
        firsthorse.setAge(7.8f);
        System.out.println(firsthorse.getAge());
        firsthorse.setFavoriteActivity("sleeping");
        System.out.println(firsthorse.getFavoriteActivity());
        firsthorse.setFavoriteFood("carrots");
        System.out.println(firsthorse.getFavoriteFood());
        firsthorse.setLevelOfHealt(5);
        System.out.println(firsthorse.getLevelOfHealt());
        firsthorse.setLevelOfHunger(3);
        System.out.println(firsthorse.getLevelOfHunger());
        firsthorse.setLevelOfMood(6);
        System.out.println(firsthorse.getLevelOfMood());

        Veterinarian firstvet=new Veterinarian();
        firstvet.setName("Vasile Castratu");
        System.out.println(firstvet.getName());
        firstvet.setSpecialization("pets");
        System.out.println(firstvet.getSpecialization());

        AnimalFood firstfood=new AnimalFood();
        firstfood.setName("whiskas");
        System.out.println(firstfood.getName());
        firstfood.setPrice(12.6f);
        System.out.println(firstfood.getPrice());
        firstfood.setAmount(50);
        System.out.println(firstfood.getAmount());
        firstfood.setAvailability(true);
        System.out.println(firstfood.getAvailability());

        RecreationalActivity firstrec=new RecreationalActivity();
        firstrec.setName("playing");
        System.out.println(firstrec.getName());

        Adopter firstadopter=new Adopter();

        firstadopter.setName("Augustin Muntean");
        System.out.println(firstadopter.getName());









    }


}
