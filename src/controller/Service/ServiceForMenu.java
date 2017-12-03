package controller.Service;

import model.Journal;
import model.Record;
import view.Constants.Constants;

import static controller.Service.ServiceForInput.*;
import static view.Show.*;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ServiceForMenu implements Constants.Messages,Constants.SwitchConstats {
    public static Locale getLocale(String command) {
        switch (command) {
            case "en":
                return new Locale("en", "GB") ;

            case "uk":
                return new Locale("uk", "UA");

            case "ru":

                return Locale.getDefault();
        }
        return Locale.getDefault();
    }

    public static String inputCommand(Scanner sc,ResourceManager manager) {


        while (true) {
            try {
                String com = sc.nextLine();
                if (com.compareTo("en")!=0 && com.compareTo("uk")!=0 && com.compareTo("ru") != 0)
                    throw new IOException();
                return com;
            } catch (IOException exp) {
                System.out.println(manager.getString(WRONG_INPUT));
            }
        }
    }

    public static int inputCommand1(Scanner sc,ResourceManager manager) {
        System.out.println(manager.getString(WHAT_TO_DO));
        while (true) {
            try {
                int com = sc.nextInt();
                if (com!=ALL_STUDENTS && com!=CREATE_RECORD && com!=DELETE_STUDENT && com!=EXIT)
                    throw new IOException();
                return com;
            } catch (IOException exp) {
               System.out.println(manager.getString(WRONG_INPUT));
            }
        }
    }
    public static void menuforSwitch(Scanner sc,ResourceManager manager, Journal<Record> journal){

        while(true){
            int command = inputCommand1(sc,manager);
            //wichSideYouOn(sc ,manager, command ,journal);
            if (wichSideYouOn(sc ,manager, command ,journal)==false){
                break;
            }

        }
    }



    public static boolean wichSideYouOn(Scanner sc, ResourceManager manager , int decision , Journal<Record> journal){
        switch (decision){
            case ALL_STUDENTS: showJournal(manager, journal);
           // menuforSwitch(sc,manager,journal);
            break;
            case CREATE_RECORD : journal.records.add(new Record(inputValidName(sc,manager),
                    inputValidLastname(sc,manager),inputValidBirhday(sc,manager),inputValidPhone(sc,manager),
                    inputValidAddress(sc,manager)));
                    showJournal(manager,journal);
                    //menuforSwitch(sc,manager,journal);
                    break;
            case DELETE_STUDENT:

                //showJournal(manager,journal);
                System.out.println(manager.getString(CHOOSE_STUDENT));
                journal.removeOne(inputCommand1(sc,manager));
                break;


            case EXIT:
                return false;


        }
    return true;

    }

}
