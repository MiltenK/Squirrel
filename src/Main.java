import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЛЕСНАЯ ИСТОРИЯ С ОРЕХАМИ ===\n");

        Tree tree = new Tree(1);
        System.out.println("Создано дерево. Уровень: " + tree.getLevel());


        System.out.println("\n--- Выращиваем орехи ---");
        tree.growNuts();


        Belka belka = new Belka("Рыжик");
        Burunduk burunduk = new Burunduk("Шустрик");


        System.out.println("\n--- Белочка собирает ---");
        belka.collectNuts(tree);


        System.out.println("\n--- Повышаем уровень дерева ---");
        tree.levelUp();


        System.out.println("\n--- Выращиваем орехи снова ---");
        tree.growNuts();


        System.out.println("\n--- Бурундук собирает ---");
        burunduk.collectNuts(tree);


        System.out.println("\n--- Повышаем уровень дерева ---");
        tree.levelUp();


        System.out.println("\n--- Выращиваем орехи на 3 уровне ---");
        tree.growNuts();


        System.out.println("\n--- Белочка снова собирает ---");
        belka.collectNuts(tree);


        System.out.println("\n--- Бурундук снова собирает ---");
        burunduk.collectNuts(tree);


        System.out.println("\n" + "=".repeat(50));
        System.out.println("ИТОГОВАЯ СТАТИСТИКА");
        System.out.println("=".repeat(50));

        belka.showStatistic();
        burunduk.showStorageStatistic();


        burunduk.showStorage();
    }
}