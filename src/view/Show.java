package view;

import controller.Service.ResourceManager;
import model.Journal;
import model.Record;
import view.Constants.Constants;

public class Show implements Constants.Messages {

    public static void printLanguages(ResourceManager manager) {
        System.out.println(manager.getString(CHOOSE_LANGUAGE));
    }

    public static String showRecord (ResourceManager manager,Record r){
        return (manager.getString(FIRSTNAME) +": "+ r.getFirstname()+"\n"+
        manager.getString(LASTNAME) + ": "+ r.getLastname()+"\n"+
        manager.getString(DATE_OF_BIRTH) + ": "+ r.getDateOfBirth()+"\n"+
        manager.getString(PHONE) + ": " + r.getPhoneNumber() + "\n" +
        manager.getString(ADDRESS) + ": "+r.getAdress());
    }


    public static void showJournal (ResourceManager manager ,Journal<Record> journal ){
        int size = journal.records.size();
        for (int i = 0; i <size ; i++) {
            System.out.println(manager.getString(STUDENT_NUM) + i);
            System.out.println(showRecord(manager , journal.records.get(i)));
            System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////");
             ;
        }
    }
















/*    public static void showResource(ResourceManager manager) {
        Enumeration<String> setKey = manager.getSetKey();
        while (setKey.hasMoreElements()) {
            String key = setKey.nextElement();
            System.out.println(key + " = " + manager.getString(key));
        }
    }*/
}
