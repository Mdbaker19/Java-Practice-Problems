import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<String> inventory = new ArrayList<>();

    public Player(){}

    public void block(){
        System.out.println("Blocked Attack");
    }

    public Player(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }


    public int getHealth(){
        return this.health;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public void addItem(String item){
        this.inventory.add(item);
    }

    public List<String> getInventory(){
        return this.inventory;
    }

}
