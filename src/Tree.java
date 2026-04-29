import java.util.ArrayList;
import java.util.List;

public class Tree {
    private int level = 1;
    private List<Nut> nuts;

    public Tree(int level) {
        this.level = level;
        this.nuts = new ArrayList<>();
    }

    public Tree() {
        this(1);
    }


    public List<Nut> getNuts() {
        return new ArrayList<>(nuts);
    }


    public Nut[] getArr() {
        return nuts.toArray(new Nut[0]);
    }

    public void growNuts() {
        int min = 0;
        int max = level;
        int count = (int) (min + Math.random() * (max - min + 1));

        nuts.clear();

        for (int i = 0; i < count; i++) {
            double weight = 1.5 + Math.random() * (15.0 - 1.5);
            nuts.add(new Nut(weight));
        }

        System.out.println("На дереве выросло " + count + " орехов:");
        for (Nut nut : nuts) {
            System.out.println("  " + nut);
        }
    }

    public void levelUp() {
        level++;
        System.out.println("Дерево повысило уровень до " + level);
    }

    public int getLevel() {
        return level;
    }
}