package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Pablo
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person ("Pablo", LocalDate.of(1999, Month.JUNE, 11));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}