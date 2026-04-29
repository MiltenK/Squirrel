import java.util.List;

public class Belka implements INutCollector{
    private String name;
    private int collectedCount;
    private double totalWeight;

    public Belka(String name) {
        this.name = name;
        this.collectedCount = 0;
        this.totalWeight = 0;
    }

    // Способность собирать орехи с дерева
    public void collectNuts(Tree tree) {
        List<Nut> nuts = tree.getNuts();

        if (nuts.isEmpty()) {
            System.out.println(name + " пришла к дереву, но орехов нет!");
            return;
        }

        System.out.println(name + " начинает собирать орехи:");

        for (Nut nut : nuts) {
            // Нашла орех - гордо сообщает
            System.out.println(name + " нашла орех! (вес: " + String.format("%.2f", nut.getWeight()) + " г)");
            collectedCount++;
            totalWeight += nut.getWeight();
        }

        System.out.println(name + " собрала все орехи с дерева!");


        tree.growNuts();

    }


    public void showStatistic() {
        System.out.println("СТАТИСТИКА БЕЛОЧКИ " + name + ":");
        System.out.println("   Всего собрано орехов: " + collectedCount);
        System.out.println("   Общий вес: " + String.format("%.2f", totalWeight) + " г");
        System.out.println("   (где сами орехи - неизвестно, спрятала 🫣)");
    }

    public String getName() {
        return name;
    }
}