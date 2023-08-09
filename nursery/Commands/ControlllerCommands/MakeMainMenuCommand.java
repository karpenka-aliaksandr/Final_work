package Commands.ControlllerCommands;
import Commands.ControlllerCommands.Base.ControllerCommand;
import Controllers.Controller;
import Models.Menu.Menu;
import Models.Menu.PunktMenu;


public class MakeMainMenuCommand extends ControllerCommand {
    public MakeMainMenuCommand(Controller controller) {
        super(controller);
    }

    @Override
    public void execute() {
        Menu menu = new Menu();
        menu.addPunkt(1,new PunktMenu("Загрузить питомник из файла", new LoadFromFileNurseryCommand(controller)));
        menu.addPunkt(2,new PunktMenu("Сохранить питомник в файл", new SaveToFileNurseryCommand(controller)));
        menu.addPunkt(3,new PunktMenu("Добавить животное в питомник", new AddAnimalCommand(controller)));
        menu.addPunkt(4,new PunktMenu("Удалить животное из питомника", new RemoveAnimalCommand(controller)));
        menu.addPunkt(5,new PunktMenu("Показать команды которые выполняет животное", new ShowCommandsCommand(controller)));
        menu.addPunkt(6,new PunktMenu("Обучить животное новым командам", new TrainAnimalCommand(controller)));
        menu.addPunkt(0,new PunktMenu("Выход", new ExitAppCommand(controller)));
        controller.getScreen().setMenu(menu);
        controller.getScreen().setBar("Введите пункт меню: ");
    }
}