package direction;

public class Up implements IPrint {

    private int height;
    private String symbolTree;

    public Up(int h, String symbolT) {
        height = h;
        symbolTree = symbolT;
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            createBranchUp(i);
        }
    }

    private void createBranchUp(int i) {
        printSign(" ", height - i - 1);
        printSign(symbolTree, 2 * i + 1);

        System.out.println();
    }

    private void printSign(String symbol, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
