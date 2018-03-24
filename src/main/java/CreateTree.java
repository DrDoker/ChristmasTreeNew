import direction.*;

import java.util.Scanner;

public class CreateTree {

    void print() {

        int height = getTreeHeight();
        String symbolTree = getTreeSymbol();
        String direction = getTreeDirection();

        switch (direction) {
            case "up":
                IPrint newTreeUp = new Up(height, symbolTree);
                newTreeUp.print();
                break;

            case "down":
                IPrint newTreeDown = new Down(height, symbolTree);
                newTreeDown.print();
                break;

            case "left":
                IPrint newTreeLeft = new Left(height, symbolTree);
                newTreeLeft.print();
                break;

            case "right":
                IPrint newTreeRight = new Right(height, symbolTree);
                newTreeRight.print();
                break;
        }
        System.out.println("\nВот такая вот елка получилась))");

    }


    private int getTreeHeight() {

        System.out.print("Enter height tree: ");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            System.out.print("  !! Please enter number: ");
            in.next();
        }

        return in.nextInt();
    }


    private String getTreeDirection() {
        System.out.print("Enter direction tree (up, down, left, right): ");
        Scanner in = new Scanner(System.in);
        while (!in.hasNext("up") && !in.hasNext("down") && !in.hasNext("left") && !in.hasNext("right")) {
            System.out.print("  !! Please enter direction: ");
            in.nextLine();
        }
        return in.nextLine();
    }

    private String getTreeSymbol() {
        System.out.print("Enter symbol tree: ");
        Scanner h = new Scanner(System.in);
        return h.nextLine();
    }

}
