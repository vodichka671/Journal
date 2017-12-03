package controller;
import controller.Service.ResourceManager;
import model.Journal;
import model.Record;
import static controller.MenuControll.menu;



public class MainController {


    public static void main(String[] args) {

         ResourceManager manager = ResourceManager.INSTANCE;

        Record a = new Record("Артем", "Мариненко", "20-02-1997", "+380934835049", "Мира-23");
        Record d = new Record("Артур", "Лебедев", "02-03-1995", "+38095476830", "Микро");
        Record e = new Record("Максим", "Улюкаев", "04-08-1907", "+38068456724", "Тростянецкая-128");
        Record h = new Record("Борат", "Махмудович", "11-11-1994", "+380456783409", "Поляна");

        Journal<Record> exper = new Journal<>();

        exper.addOne(a);
        exper.addOne(d);
        exper.addOne(e);
        exper.addOne(h);

        menu(manager , exper);


    }
}