public class HogwartsStudent {
    private int magic;
    private int transgression;
    private final String name;
    private final String surname;

    public HogwartsStudent(String name, String surname,int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Hogwarts student named " + name + " " + surname + " has " + magic
                + " magic and " + transgression + " transgression.";
    }
    public void compareAtUniversity(HogwartsStudent otherStudent) {
        int result = (this.magic + this.transgression) - (otherStudent.getMagic() + otherStudent.getTransgression());
        if (result > 0) {
            System.out.printf("%s %s has more magic power than %s %s ",
                    this.getName(), this.getSurname(), otherStudent.getName(), otherStudent.getSurname());
        } else if (result < 0) {
            System.out.printf("%s %s has more magic power than %s %s ",
                    otherStudent.getName(), otherStudent.getSurname(), this.getName(), this.getSurname());
        } else {
            System.out.println("Students are equal");
        }
    }
}