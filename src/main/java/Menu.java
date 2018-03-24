import java.util.Scanner;

public class Menu {

    private int choice;
    private boolean flage = true;


    void printMenu() {


        do {
            System.out.println("\nCreate Christmas Tree__________1");
            System.out.println("Exit___________________________2");

            System.out.print("\nChoose your action: ");

            Scanner in = new Scanner(System.in);
            choice = Integer.parseInt(in.nextLine());

            switch (choice) {
                case 1:
                    CreateTree newTree = new CreateTree();
                    newTree.print();
                    break;

                case 2:
                    flage = false;
                    break;
            }

        } while (flage);
    }
}
