public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, String surname, int magic, int transgression,
                             int nobility, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return  "Gryffindor student named " + getName() + " " + getSurname() + " has " + getMagic()
                + " magic and " + getTransgression() + " transgression. Individual qualities: nobility - " + nobility
                + "; honor - " + honor + "; bravery - " + bravery + ".";
    }
    public void compareAtFaculty (GryffindorStudent otherStudent){
        int result = (this.honor + this.bravery + this.nobility) -
                (otherStudent.getHonor()+ otherStudent.getBravery() + otherStudent.getNobility());
        if (result > 0){
            System.out.printf("%s is a better Gryffindor student than the %s ",this.getName(),otherStudent.getName());
        } else if (result < 0) {
            System.out.printf("%s is a better Gryffindor student than the %s ",otherStudent.getName(),this.getName());
        }else {
            System.out.println("Students are equal");
        }
    }
}
