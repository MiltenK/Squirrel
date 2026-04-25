public class Tree {
    private int level = 1;
    private Nut[] arr = null;

    public Tree(int level) {
        this.level = level;
    }

    public Nut[] getArr() {
        return arr;
    }

    public void growNuts() {
        int min = 0;
        int max = level;
        int len = (int) (min + Math.random() * (max - min + 1));
        arr = new Nut[len];



        for (int i = 0; i < len; i++) {
            double min2 = 1.5;
            double max2 = 15.0;
            arr[i] = new Nut(min2 + Math.random() * (max2 - min2));
        }


        for (Nut nut : arr) {
            System.out.println(nut);
        }
    }

    public void levelUp() {
        level++;
    }

}