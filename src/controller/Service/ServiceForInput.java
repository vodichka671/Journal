package controller.Service;

import view.Constants.Constants;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceForInput implements Constants.Messages, Constants.RegexBox{
public static String inputValidName(Scanner sc ,ResourceManager manager ){
        System.out.println(manager.getString(ENTER_NAME));
        boolean flag =false;
    while (true) {
        try {
            String com = sc.nextLine();
            String valid = manager.getString(REGEX_NAME);
            Pattern pattern = Pattern.compile(valid);
            Matcher matcher = pattern.matcher(com);
            if (!(matcher.find()))
                throw new IOException();
            return com;
        } catch (IOException exp) {
            if (flag==true){
                System.out.println(manager.getString(WRONG_INPUT));

            }
            flag = true;


        }
    }
    }
    public static String inputValidLastname(Scanner sc ,ResourceManager manager ){
        System.out.println(manager.getString(ENTER_SURNAME));
        while (true) {
            try {
                String com = sc.nextLine();
                String valid = manager.getString(REGEX_SURNAME);
                Pattern pattern = Pattern.compile(valid);
                Matcher matcher = pattern.matcher(com);
                if (!(matcher.find()))
                    throw new IOException();
                return com;
            } catch (IOException exp) {
                System.out.println(manager.getString(WRONG_INPUT));
            }
        }
    }

    public static String inputValidBirhday(Scanner sc ,ResourceManager manager ){
        System.out.println(manager.getString(ENTER_BIRTH_DATE));
        while (true) {
            try {
                String com = sc.nextLine();
                String valid = manager.getString(REGEX_BIRTH_DATE);
                Pattern pattern = Pattern.compile(valid);
                Matcher matcher = pattern.matcher(com);
                if (!(matcher.find()))
                    throw new IOException();
                return com;
            } catch (IOException exp) {
                System.out.println(manager.getString(WRONG_INPUT));
            }
        }
    }
    public static String inputValidPhone(Scanner sc ,ResourceManager manager ){
        System.out.println(manager.getString(ENTER_TELEPHONE));
        while (true) {
            try {
                String com = sc.nextLine();
                String valid = manager.getString(REGEX_TELEPHONE);
                Pattern pattern = Pattern.compile(valid);
                Matcher matcher = pattern.matcher(com);
                if (!(matcher.find()))
                    throw new IOException();
                return com;
            } catch (IOException exp) {
                 System.out.println(manager.getString(WRONG_INPUT));
            }
        }
    }

    public static String inputValidAddress(Scanner sc ,ResourceManager manager){
        boolean flag =false;
        System.out.println(manager.getString(ENTER_ADDRESS));
        while (true) {
            try {
                String com = sc.nextLine();
                String valid = manager.getString(REGEX_ADDRESS);
                Pattern pattern = Pattern.compile(valid);
                Matcher matcher = pattern.matcher(com);
                if (!(matcher.find()))
                    throw new IOException();
                return com;
            } catch (IOException exp) {
                if (flag==true){
                    System.out.println(manager.getString(WRONG_INPUT));

                }
                flag = true;
            }
        }
    }




}
