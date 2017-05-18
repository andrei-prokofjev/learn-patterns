package com.apro.patterns.behavioral.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        Iterator iter = namesRepository.getIterator();


        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

    }

}
