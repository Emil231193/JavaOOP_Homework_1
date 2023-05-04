public class Witcher extends Creature {
    public Witcher(String name, int body, int agility, int intelligence, int treatment, int oblivion) {
        super(name, body, agility, intelligence, treatment, oblivion);
        this.weapon = new Weapon("Посох", 20);
        this.clothes = new Cloth("Мантия", 20);
    }
    @Override
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.intelligence
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);
    }
    @Override
    public void treatment(Creature target) {
        target.health_point += this.treatment;
    }
    @Override
    public void oblivion(Creature target) {
        target.intelligence -= (this.intelligence > this.oblivion ? (this.intelligence - this.oblivion) : this.intelligence) - this.intelligence;
//        target.intelligence -= ((this.oblivion) > (this.intelligence) ? 0 : ((this.intelligence) - (this.oblivion)));
    }
}