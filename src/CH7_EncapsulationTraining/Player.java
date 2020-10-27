package CH7_EncapsulationTraining;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth (int damage){
        this.health -= damage;
        if(this.health <=0){
            System.out.println("Player knocked out");
            //Reduce number of remaining lives
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
