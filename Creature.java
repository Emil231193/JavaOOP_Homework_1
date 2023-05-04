public abstract class Creature implements Task_1.Attack {
    String name;
    int body;
    int agility;
    int intelligence;
    int treatment;
    int oblivion;
    int health_point;
    int mana;
    Weapon weapon;
    Cloth clothes;

    public Creature(String name, int body, int agility, int intelligence, int treatment, int oblivion) {
        this.name = name;
        this.body = body;
        this.agility = agility;
        this.intelligence = intelligence;
        this.treatment = treatment;
        this.oblivion = oblivion;
        this.health_point = body * 30;
        this.mana = intelligence * 40;
    }

    protected String getInfo() {
        return (String.format(
                "%s, Тело-%d, Ловкость-%d, Интелект-%d, Лечение-%d, Забвение-%d, Здоровье-%d, Энергия-%d, Оружие ''%s''-%d, Одежда ''%s''-%d",
                this.name, this.body, this.agility, this.intelligence, this.treatment, this.oblivion, this.health_point, this.mana,
                this.weapon.name,
                this.weapon.dmg, this.clothes.name, this.clothes.def));
    }
    public abstract void treatment(Creature target);
    public abstract void oblivion(Creature target);
}