package direction;

public class Down implements IPrint {

    private int height;
    private String symbolTree;

    public Down(int h, String symbolT) {
        height = h;
        symbolTree = symbolT;
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            createBranchDown(i);
        }
    }

    private void createBranchDown(int i) {
        printSign(" ", i);
        printSign(symbolTree, 2 * height - (2 * i + 1));

        System.out.println();
    }

    private void printSign(String symbol, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
        }
    }


}