package direction;

public class Right implements IPrint {

    private int heightRight;
    private int height;
    private String symbolTree;

    public Right(int h, String symbolT) {
        height = h;
        heightRight = 2 * h - 1;
        symbolTree = symbolT;
    }

    public void print() {
        for (int i = 0; i < heightRight; i++) {
            createBranchRight(i);
        }
    }

    private void createBranchRight(int i) {
        if (i < height - 1) {
            printSign(symbolTree, i + 1);
        } else {
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