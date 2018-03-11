import com.google.common.collect.Lists;

import java.util.ArrayList;

public class MyAPI {

    public static void main(String[] args) {

        ArrayList<Person> persons = Lists.newArrayList(
                new Person("John", Gender.MALE),
                new Person("George", Gender.MALE)
        );

        for (Person person : persons)
            System.out.println(person.toString());

    }

}
