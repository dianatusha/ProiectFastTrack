package Lab2.AnimalRescue;

public class AnimalFood {
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    private float price;
    public void setPrice(float price){
        this.price=price;
    }
    public float getPrice(){
        return price;
    }
    private int amount;
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return amount;
    }
    private boolean availability;
    public void setAvailability(boolean availability){
        this.availability=availability;
    }
    public boolean getAvailability(){
        return availability;
    }
}
