import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree(3);
        tree1.growNuts();
        tree1.levelUp();
        System.out.println("_____________________________________________________________");
        tree1.growNuts();
        System.out.println(Arrays.toString(tree1.getArr()));
    }

}