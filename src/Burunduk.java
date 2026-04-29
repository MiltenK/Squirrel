import java.util.ArrayList;
import java.util.List;

public class Burunduk implements INutCollector{
    private String name;
    private List<Nut> storage;
    private double deliveryChance;

    public Burunduk(String name) {
        this.name = name;
        this.storage = new ArrayList<>();
        this.deliveryChance = 0.75;
    }


    public void collectNuts(Tree tree) {
        List<Nut> nuts = tree.getNuts();

        if (nuts.isEmpty()) {
            System.out.println(name + " пришёл к дереву, но орехов нет!");
            return;
        }

        System.out.println(name + " начинает собирать орехи:");

        int deliveredCount = 0;
        double deliveredWeight = 0;

        for (Nut nut : nuts) {
            System.out.println(name + " нашёл орех! (вес: " + String.format("%.2f", nut.getWeight()) + " г)");

            double chance = Math.random();
            if (chance <= deliveryChance) {
                storage.add(new Nut(nut.getWeight()));
                deliveredCount++;
                deliveredWeight += nut.getWeight();
                System.out.println("     Донёс до склада!");
            } else {
                System.out.println("     Потерял по дороге!");
            }
        }

        System.out.println(name + " закончил сбор. Донесено: " + deliveredCount + " орехов из " + nuts.size());


        tree.growNuts();
    }


    public void showStorageStatistic() {
        double totalWeight = 0;
        for (Nut nut : storage) {
            totalWeight += nut.getWeight();
        }

        System.out.println("СТАТИСТИКА СКЛАДА БУРУНДУКА " + name + ":");
        System.out.println("   Орехов на складе: " + storage.size());
        System.out.println("   Общий вес: " + String.format("%.2f", totalWeight) + " г");
    }


    public void showStorage() {
        System.out.println("\nСклад " + name + ":");
        if (storage.isEmpty()) {
            System.out.println("  Пусто");
        } else {
            for (int i = 0; i < storage.size(); i++) {
                System.out.println("  " + (i+1) + ". " + storage.get(i));
            }
        }
    }

    public String getName() {
        return name;
    }
}