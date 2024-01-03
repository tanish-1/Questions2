package oop2.Revision.properties.inheritance;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Little Programme of of Mine " +"\n"+
                "Choose Your Gender"+"\n"+
                 "1.Male"+"\n"+
                  "2.Female");

        System.out.print("Enter : ");
        String option = sc.next();
        if(option.equals("Male") || option.equals("male") || option.equals("1") || option.equals("m") || option.equals("M") || option.equals("1.Male")){
            System.out.print("Enter your name : ");
            String name = sc.next();
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            System.out.print("Enter your occupation : ");
            String occ = sc.next();
            Person male = new Person(name, age, occ);
            male.aboutYou();
        } else if (option.equals("Female") || option.equals("female") || option.equals("2") || option.equals("f") || option.equals("F") || option.equals("2.Female")) {
            System.out.print("Enter your name : ");
            String name = sc.next();
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            System.out.print("Enter your occupation : ");
            String occ = sc.next();
            Person female = new Person(name, age, occ);
            female.aboutYou();
        }
        System.out.print("Do you want to know little about Your species : " );
        String ask = sc.next();
        Person person = new Person();
        if(ask.equals("yes") || ask.equals("ok") || ask.equals("y")){
            System.out.println("Well you are " + Human.species + " species. " +"\n" +"The word \"human\" can refer to all members of the Homo genus, but in common" +"\n"+ "usage it generally just refers to Homo sapiens, the only extant species " + "Human"+"\n"+ "are classifies into " + Human.cls + " They are most intelligent species on earth." +"\n"+ "They have, " + Human.eye + " eye, "+Human.arms+" arms, "+Human.noses+" nose, which is used to smell "+"and has "+Human.tongue + " tongue which"+"\n"+" is for taste , etc. ");
            System.out.print("For Male they have penis : ");
            System.out.println();
            person.penis();
            System.out.print("For Female they have breasts and vagina : ");
            System.out.println();
            person.breast();
            person.vagina();
        } else if (ask.equals("no")|| ask.equals("n")) {
            System.out.println("Well then Bye , Have have a good Day.");
        }


    }
}
