package Lab3.AnimalRescue;

public class AppMain {
    public static void main(String[] args){
        Animal firstanimal=new Animal();
        firstanimal.setName("Animalul");
        System.out.println(firstanimal.getName());
        firstanimal.setAge(4f);
        System.out.println(firstanimal.getAge());
        firstanimal.setFavoriteActivity("playing with the ball");
        System.out.println(firstanimal.getFavoriteActivity());
        firstanimal.setFavoriteFood("Sheeba");
        System.out.println(firstanimal.getFavoriteFood());
        firstanimal.setLevelOfHealt(8);
        System.out.println(firstanimal.getLevelOfHealt());
        firstanimal.setLevelOfHunger(7);
        System.out.println(firstanimal.getLevelOfHunger());
        firstanimal.setLevelOfMood(7);
        System.out.println(firstanimal.getLevelOfMood());

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
