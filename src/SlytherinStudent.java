public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudent(String name, String surname, int magic, int transgression, int cunning,
                            int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin student named " + getName() + " " + getSurname() + " has " + getMagic()
                + " magic and " + getTransgression() + " transgression. Individual qualities: cunning - "
                + cunning + "; determination - " + determination + "; ambition - " + ambition + "; resourcefulness - "
                + resourcefulness + "; lust for power - " + lustForPower + ".";
    }
    public void compareAtFaculty (SlytherinStudent otherStudent){
        int result = (this.ambition + this.cunning + this.lustForPower + this.determination + this.resourcefulness) -
                (otherStudent.getAmbition() + otherStudent.getCunning() + otherStudent.getLustForPower() +
                otherStudent.getDetermination() + otherStudent.getResourcefulness());
        if (result > 0){
            System.out.printf("%s is a better Slytherin student than the %s ",this.getName(),otherStudent.getName());
        } else if (result < 0) {
            System.out.printf("%s is a better Slytherin student than the %s ",otherStudent.getName(),this.getName());
        }else {
            System.out.println("Students are equal");
        }
    }
}
