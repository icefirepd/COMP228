package FangDou_COMP228Lab1;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        //create 1 Singer (singer1) object with the help of the no argument constructor
        Singers singer1 = new Singers();

        //Display the default values of the instance variables of this object singer1.
        System.out.println("Default values: ");
        printData(singer1);

        //Set the values of each instance variables with the help of setters.
        singer1.setSingerId(99999);
        singer1.setSingerName("Abc Def");
        singer1.setSingerAddress("99 Ghi Road, Toronto, ON");
        singer1.setDateOfBirth(LocalDate.of(1999,9,19));
        singer1.setNumberOfAlbums(9);

        //Display the values
        System.out.println("New values:");
        printData(singer1);
    }

    private static void printData(Singers singer) {
        System.out.println("Singer’s id: " + singer.getSingerId());
        System.out.println("Singer’s name: " + singer.getSingerName());
        System.out.println("Singer’s address: " + singer.getSingerAddress());
        System.out.println("Date of birth: " + singer.getDateOfBirth());
        System.out.println("Number of albums published: " + singer.getNumberOfAlbums());
        System.out.println();
    }
}