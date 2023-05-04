import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Peasant peasant_1 = new Peasant("Крестьянин", 9, 4, 2, 1, 0);
        Rouge rouge_1 = new Rouge("Разбойник", 8, 6, 6, 1, 0);
        Archer archer_1 = new Archer("Лучник", 5, 9, 5, 2, 0);
        Witcher witcher_1 = new Witcher("Маг", 4, 5, 9, 10, 5);
        Spearman spearman_1 = new Spearman("Копейщик", 7, 8, 3, 2, 0);
        Bowman bowman_1 = new Bowman("Арбалетчик", 6, 7, 4, 3, 0);
        Monk monk_1 = new Monk("Монах", 3, 3, 3, 5, 3);

        System.out.println(monk_1.getInfo());
        witcher_1.oblivion(monk_1);
        System.out.println(monk_1.getInfo());
    }
     interface Attack {
        void attack(Creature target);
    }
     interface Treatment {
        void treatment(Creature target);
    }
    interface Oblivion {
        void oblivion(Creature target);
    }
}