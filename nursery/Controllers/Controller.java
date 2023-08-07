package Controllers;

import Commands.ControlllerCommands.MakeMainMenuCommand;
import Models.Menu.PunktMenu;
import Models.Nursery.Nursery;
import Views.View;
import Views.Screen;

public class Controller {
    boolean exitApp;
    Screen screen;
    Nursery nursery;
    View view;

    public Controller(Screen screen, Nursery nursery) {
        this.screen = screen;
        this.view = screen.getView();
        this.nursery = nursery;
        this.exitApp = false;
    }

    public void run() {

        new MakeMainMenuCommand(this).execute();
        while (!exitApp) {
            screen.show();
            int numPunkt = view.getPositiveInt();
            PunktMenu pm = screen.getMenu().getPunkt(numPunkt);
            if (pm == null) {
                screen.setBar("Неправильный выбор");
            } else {
                pm.run();
            }
        }

    }

    public Screen getScreen() {
        return this.screen;
    }

    public Nursery getNursery() {
        return this.nursery;
    }

    public void setExitApp() {
        this.exitApp = true;
    }

}
