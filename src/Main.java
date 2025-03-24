class GameCharacter{
    private int energy = 10;

    void increaseEnergy(int amount){
        if(100 < energy + amount){
            System.out.println("Energy is too high");
        }
        else{
            energy += amount;
            System.out.println("Got " + amount + " energy");
        }
    }

    void decreaseEnergy(int amount){
        if(0 > energy - amount){
            System.out.println("Energy is too low");
        }
        else{
            energy -= amount;
            System.out.println("Lost " + amount + " energy");
        }
    }

    void getEnergy(){
        System.out.println("Energy: " + energy);
    }
}


public class Main {
    public static void main(String[] args) {

        GameCharacter gc = new GameCharacter();
        gc.getEnergy();
        gc.decreaseEnergy(30);
        gc.decreaseEnergy(10);
        gc.energy += 100;
        gc.increaseEnergy(100);
        gc.getEnergy();

    }
}