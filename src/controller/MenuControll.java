package controller;

import controller.Service.ResourceManager;
import model.Journal;
import model.Record;
import view.Constants.Constants;

import java.util.Locale;
import java.util.Scanner;


import static controller.Service.ServiceForMenu.*;
import static view.Show.printLanguages;


public class MenuControll implements Constants.Messages {


    public static void menu (ResourceManager manager , Journal<Record> journal){
        Scanner sc = new Scanner(System.in);
        while (true) {
            printLanguages(manager);
            String command = inputCommand(sc,manager);
            Locale locale = getLocale(command);
            manager.changeResource(locale);
            break;
        }

        menuforSwitch(sc,manager,journal);




    }
}
