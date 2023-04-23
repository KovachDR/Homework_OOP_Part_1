public class Main {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Harry", "Potter",50,
                50,60,70,80);
        GryffindorStudent hermione = new GryffindorStudent("Hermione", "Granger",90,
                90,40,40,60);
        GryffindorStudent ron = new GryffindorStudent("Ron", "Weasley",10,
                20,50,40,40);
        SlytherinStudent drako = new SlytherinStudent("Draco", "Malfoy",30,30,
                50,60,80,50,90);
        SlytherinStudent graham = new SlytherinStudent("GGraham", "Montegr",36,62,
                68,42,62,12,50);
        SlytherinStudent gregori = new SlytherinStudent("Gregori", "Goyl",25,60,
                28,29,96,28,68);
        HufflepuffStudent zacharias = new HufflepuffStudent("Zacharias", "Smith",
                63,53,42,85,74);
        HufflepuffStudent cedric = new HufflepuffStudent("Cedric", "Diggory",
                74,85,69,41,36);
        HufflepuffStudent justin = new HufflepuffStudent("Justin", "Finch",
                26,85,42,65,25);
        RavenclawStudent cho = new RavenclawStudent("Cho", "Chang",
                52,65,74,62,45,65);
        RavenclawStudent padma = new RavenclawStudent("Padma", "Patil",
                45,65,35,42,85,45);
        RavenclawStudent marcus = new RavenclawStudent("Marcus", "Belby",
                52,23,25,74,82,65);
        System.out.println(justin);
        hermione.compareAtFaculty(ron);
        System.out.println();
        harry.compareAtUniversity(cedric);
    }
}
