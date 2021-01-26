package kata1;

import java.time.LocalDate;

/**
 *
 * @author Pablo
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return (int) ((LocalDate.now().toEpochDay() - birthdate.toEpochDay()) /365);
        
    }
}