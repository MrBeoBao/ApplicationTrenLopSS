
package ddd;

import java.util.ArrayList;

public class Player extends Character{
    
    private int MP;
    private int maxMP;
    private int ragePoint;
    private int maxRagePoint;
    ArrayList<Item> inventory = new ArrayList<>();
    private int money = 1000;
    private Weapon weapon = new Weapon(0, "Platic sword", 5);
    private int def;
    private int statsPoint = 0;
    private boolean armorEquipped = false;
    private boolean helmetEquipped = false;
    private boolean quanSipEquipped = false;
    private boolean empowered = false;
    private int originalAttack = 0;

    public Player() {
    }

    public Player(int MP, int maxMP, int ragePoint, int maxRagePoint, int HP, int maxHP, int attack, int level) {
        super(HP, maxHP, attack, level);
        this.MP = MP;
        this.maxMP = maxMP;
        this.ragePoint = ragePoint;
        this.maxRagePoint = maxRagePoint;
    }

    public int getStatsPoint() {
        return statsPoint;
    }

    public void setStatsPoint(int statsPoint) {
        this.statsPoint = statsPoint;
    }
    
    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getRagePoint() {
        return ragePoint;
    }

    public void setRagePoint(int ragePoint) {
        if(ragePoint > getMaxRagePoint()){
            ragePoint = getMaxRagePoint();
        }
            
        this.ragePoint = ragePoint;
    }

    public int getMaxRagePoint() {
        return maxRagePoint;
    }

    public void setMaxRagePoint(int maxRagePoint) {
        this.maxRagePoint = maxRagePoint;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    
    
    
    public void addItem(Player p){
        for(int i = 0; i < p.inventory.size(); i++){
            inventory.add(p.inventory.get(i));
        }
        
    }
    
    public void equipStrongestWeapon() {
    Weapon bestWeapon = null;
    int maxDamage = 0;

    for (Item item : inventory) {
        if (item instanceof Weapon) {
            Weapon w = (Weapon) item;
            if (w.getStat() > maxDamage) {
                maxDamage = w.getStat();
                bestWeapon = w;
            }
        }
    }

    if (bestWeapon != null) {
        this.weapon = bestWeapon;
    }
}
    public void equipArmorFromInventory() {
    for (Item item : inventory) {
        if (item.getName().equalsIgnoreCase("Armor") && !armorEquipped) {
            def += 10;
            armorEquipped = true;
        } 
        else if (item.getName().equalsIgnoreCase("Helmet") && !helmetEquipped) {
            def += 10;
            helmetEquipped = true;
        } 
        else if (item.getName().equalsIgnoreCase("Pant") && !quanSipEquipped) {
            def += 10;
            quanSipEquipped = true;
        }
    }
}
    public void empower() {
    if (!empowered) {
        originalAttack = getAttack();
        setAttack(originalAttack + 20);
        empowered = true;
    }
    }

    public void resetEmpower() {
        if (empowered) {
            setAttack(originalAttack);
            empowered = false;
        }
    }

    public boolean isEmpowered() {
        return empowered;
    }

    
}
