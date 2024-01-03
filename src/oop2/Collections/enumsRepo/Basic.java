package oop2.Collections.enumsRepo;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday , Friday , Saturday, Sunday
// they are enums constanst
//        they are static , public and final
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Wednesday;

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
    }
}
