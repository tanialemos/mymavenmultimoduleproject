public class Person {

    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString(){
        return String.format("This is %s. %s is a %s.", this.name, this.name, this.gender);
    }
}
