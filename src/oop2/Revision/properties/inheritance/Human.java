package oop2.Revision.properties.inheritance;

public class Human implements Male, Female {
    static String species;
    static String cls;
   static int eye;
   static int noses;
   static int  arms;
   static int tongue;

   static {
     species = "Homo sapiens";
     cls = "Mammal";
     eye = 2;
     noses = 1;
     arms = 2;
     tongue = 1;
   }

    @Override
    public void breast() {
        System.out.println("Breasts : They are two soft round parts of Female to produce milk and for sex");
    }

    @Override
    public void vagina() {
        System.out.println("Vagina : This is part of Female");
    }

    @Override
    public void penis() {
        System.out.println("Penis : This is the part of Male , which goes into vagina during sex");
    }
}

