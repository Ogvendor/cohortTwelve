package godmana;

import java.util.Scanner;

public class TestVictor {



    public static void main(String[] args) {

        Victor firstBorn = new Victor();


        firstBorn.setName("fate");

        System.out.println(firstBorn.getName());


        Victor secondBorn = new Victor("alex","small head", "big body");

        System.out.println(secondBorn.getName());

        System.out.println(secondBorn.getHead());
    }

}
