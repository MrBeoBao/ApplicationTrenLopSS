
package ddd;


public class Character {
    private int HP;
    private int maxHP;
    private int attack;
    private int level;
    public Character() {
    }

    public Character(int HP, int maxHP, int attack, int level) {
        this.HP = HP;
        this.maxHP = maxHP;
        this.attack = attack;
        this.level = level;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        if(HP > getMaxHP()){
            HP = getMaxHP();
        }
        this.HP = HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    public void takeDamage(int damage) {
        if(damage < 0){
            damage = 0;
        }
        this.HP -= damage;
        if (this.HP < 0) {
            this.HP = 0;
        }
    }
    
    public void attack(Character target) {
        target.takeDamage(this.attack);
    }
}
