package direction;

public class Left implements IPrint {

    private int height;
    private int heightLeft;
    private String symbolTree;


    public Left(int h, String symbolT) {
        height = h;
        heightLeft = 2 * h - 1;
        symbolTree = symbolT;
    }

    public void print() {
        for (int i = 0; i < heightLeft; i++) {
            createBranchLeft(i);
        }
    }

    private void createBranchLeft(int i) {
        if (i < height - 1) {
            printSign(" ", height - i - 1);
            printSign(symbolTree, i + 1);
        } else {
            printSign(" ", i - height + 1);
            printSign(symbolTree, height - (i - height + 1));
        }

        System.out.println();
    }

    private void printSign(String symbol, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }
}
