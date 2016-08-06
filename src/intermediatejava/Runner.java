package intermediatejava;


public class Runner extends Person{
    
    private int speed;

    public Runner() {
    }

    public Runner(int speed) {
        this.speed = speed;
    }

    public Runner(int speed, String firstName, String surName, int age, int id) {
        super(firstName, surName, age, id);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return String.format("UserID: %d. Name: %s %s. Age: %d. Running speed %d kph.",
                super.getId(),
                super.getFirstName(),
                super.getSurName(),
                super.getAge(),
                speed
                
                );
    }
    
}
