package model;

import java.util.ArrayList;

public class Journal<Record> {

    public   ArrayList<Record> records = new ArrayList<>();

    public void addOne(Record r){
        records.add(r);
    }

    public void removeOne(int i){
        records.remove(i);
    }

    private ArrayList<Record> getAllRecords(){
        return records;
    }



}
