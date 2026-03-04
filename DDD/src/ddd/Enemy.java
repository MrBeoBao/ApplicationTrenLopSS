package ddd;

import java.util.Random;

public class Enemy extends Character {
    private int randomLevel;

    public Enemy(int level) {
        super();
        Random rand = new Random();
        this.randomLevel = rand.nextInt(6) + level;
        setMaxHP(15 * this.randomLevel);
        setHP(15 * this.randomLevel);
        
        setAttack(5 * this.randomLevel);
        setLevel(this.randomLevel);
    }
}