public class HufflepuffStudent extends HogwartsStudent {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, String surname, int magic, int transgression,
                             int industriousness, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff student named " + getName() + " " + getSurname() + " has " + getMagic()
                + " magic and " + getTransgression() + " transgression. Individual qualities: industriousness - "
                + industriousness + "; loyalty - " + loyalty+ "; honesty - " + honesty + ".";
    }
    public void compareAtFaculty (HufflepuffStudent otherStudent){
        int result = (this.industriousness + this.loyalty + this.honesty) -
                (otherStudent.getIndustriousness()+ otherStudent.getLoyalty() + otherStudent.getHonesty());
        if (result > 0){
            System.out.printf("%s is a better Hufflepuff student than the %s ",this.getName(),otherStudent.getName());
        } else if (result < 0) {
            System.out.printf("%s is a better Hufflepuff student than the %s ",otherStudent.getName(),this.getName());
        }else {
            System.out.println("Students are equal");
        }
    }
}
