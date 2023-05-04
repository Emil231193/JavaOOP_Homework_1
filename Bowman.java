public class Bowman extends Creature {
    public Bowman(String name, int body, int agility, int intelligence, int treatment, int oblivion) {
        super(name, body, agility, intelligence, treatment, oblivion);
        this.weapon = new Weapon("Арбалет", 27);
        this.clothes = new Cloth("Легкая броня", 17);
    }
    @Override
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.agility
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);
    }
    @Override
    public void treatment(Creature target) {
        target.health_point += this.treatment;
    }
    @Override
    public void oblivion(Creature target) {
        target.intelligence -= (this.intelligence > this.oblivion ? this.oblivion : this.intelligence);
    }
}