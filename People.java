package com.week6;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public long findById(long id) {
        for (Person yoo : personList) {
            return yoo.getId();
        }
        return id;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public long remove(long id){
        for (Person getOuttaHere : personList) {
            if(getOuttaHere.equals(id)){
                personList.remove(personList);
            }
        }
        return id;
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public void toArray(){
        personList.toArray();
    }

    public void iterator(){
        personList.iterator();
    }
}
