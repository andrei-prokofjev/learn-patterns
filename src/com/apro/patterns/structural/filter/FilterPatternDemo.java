package com.apro.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("andrei", "male", "married"));
        personList.add(new Person("sergei", "male", "married"));
        personList.add(new Person("tatjana", "female", "single"));
        personList.add(new Person("vadim", "male", "single"));

        Criteria singles = new SingleCriteria();
        Criteria males = new MaleCriteria();
        Criteria females = new FemaleCriteria();

        Criteria singleMales = new AndCriteria(singles, males);
        Criteria singleFemales = new AndCriteria(singles, females);
        Criteria singleMalesOrFemales = new OrCriteria(singleMales, singleFemales);

        printPersons(singleMalesOrFemales.meetCriteria(personList));

    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name: " + person.getName() + ",\tGender: " + person.getGender() + ",\tMarital Status: " + person.getMaritalStatus() + " ]");
        }
    }
}
