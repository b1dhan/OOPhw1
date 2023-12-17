import models.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] marks1={96,78,92,86,89};
        int[] marks2={78,96,70,90,86};
        int[] marks3={83,84,96,79,85};
        Student std1 = new Student("Ram",18,marks1,11);
        Student std2 = new Student("Shyam",17,marks2,11);
        Student std3 = new Student("Ghanshyam",16,marks3,11 );
        std1.resultdisplayer();
        std2.resultdisplayer();
        std3.resultdisplayer();
    }
}