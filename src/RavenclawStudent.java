public class RavenclawStudent extends HogwartsStudent {
    private int wisdom;
    private int intelligence;
    private int wit;
    private int creation;

    public RavenclawStudent(String name, String surname, int magic, int transgression,
                            int wisdom, int intelligence, int wit, int creation) {
        super(name, surname, magic, transgression);
        this.wisdom = wisdom;
        this.intelligence = intelligence;
        this.wit = wit;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw student named " + getName() + " " + getSurname() + " has " + getMagic()
                + " magic and " + getTransgression() + " transgression. Individual qualities: wisdom - "
                + wisdom + "; intelligence - " + intelligence + "; wit - " + wit + "; creation - " + creation + ".";
    }
    public void compareAtFaculty (RavenclawStudent otherStudent){
        int result = (this.wisdom + this.intelligence + this.wit + this.creation) -
                (otherStudent.getWisdom() + otherStudent.getIntelligence() + otherStudent.getWit()
                        + otherStudent.getCreation());
        if (result > 0){
            System.out.printf("%s is a better Ravenclaw student than the %s ",this.getName(),otherStudent.getName());
        } else if (result < 0) {
            System.out.printf("%s is a better Ravenclaw student than the %s ",otherStudent.getName(),this.getName());
        }else {
            System.out.println("Students are equal");
        }
    }
}
