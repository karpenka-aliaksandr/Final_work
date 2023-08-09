import java.util.Scanner;

import Controllers.Controller;
import Models.Nursery.Nursery;
import Views.Screen;
import Views.View;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in,"cp866");
        Nursery nursery = new Nursery();
        View view = new View(scan);
        Screen screen = new Screen(view);
        Controller ctrl = new Controller(screen, nursery);
        ctrl.run();
        scan.close();
    }
}
