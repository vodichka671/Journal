package view.Constants;

public interface Constants {
     interface Messages{
        String CHOOSE_LANGUAGE = "choose.language";
        String WHAT_TO_DO = "what.to.do";
        String CHOOSE_STUDENT = "choose.student";
        String STUDENT_NUM = "student.num";


        String FIRSTNAME = "firstname";
        String LASTNAME = "lastname";
        String DATE_OF_BIRTH = "date.of.birth";
        String PHONE = "phone";
        String ADDRESS = "address";


        String ENTER_NAME = "enter.name";
        String ENTER_SURNAME = "enter.surname";
        String ENTER_TELEPHONE = "enter.telephone";
        String ENTER_BIRTH_DATE = "enter.birth.date";
        String ENTER_ADDRESS = "enter.address";




        String WRONG_INPUT = "wrong.input";


    }

    interface RegexBox{
        String REGEX_NAME = "regex.name";
        String REGEX_SURNAME = "regex.surname";
        String REGEX_BIRTH_DATE = "regex.birth.date";
        String REGEX_TELEPHONE = "regex.telephone.regexp";
        String REGEX_ADDRESS = "regex.address";
    }

  interface SwitchConstats{
      int ALL_STUDENTS = 1;
      int CREATE_RECORD = 2;
      int DELETE_STUDENT = 3;
      int EXIT = 4;


  }


}
