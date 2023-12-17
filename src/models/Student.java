package models;

public class Student {
    String name;
    int age;
    int [] marks;
    int grade;

    public Student(String name, int age, int[] marks, int grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void resultdisplayer(){
        int total=0;
        int n=0;
        for(n=0;n<5;n++){
            total=total+ this.marks[n];
        }
        float percentage=total/5f;

        String finalgrade;
        if(percentage>100){
            finalgrade = "Should be less than 100; Error";
        } else if (percentage>=90) {
            finalgrade = "A+";
        } else if (percentage>=80) {
            finalgrade = "A";
        } else if (percentage>=70) {
            finalgrade = "B+";
        } else if (percentage>=60) {
            finalgrade = "B";
        } else if (percentage>=50) {
            finalgrade = "C+";
        } else if (percentage>=40) {
            finalgrade = "C";
        } else if (percentage>=0) {
            finalgrade = "NG";
        }
        else {
            finalgrade = "Error";
        }
        System.out.println("\t  \t REPORT CARD");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Grade:"+this.grade);
        System.out.println("Subject \t Marks");
        System.out.println("English \t "+this.marks[0]);
        System.out.println("Nepali \t \t "+this.marks[1]);
        System.out.println("Math \t \t "+this.marks[2]);
        System.out.println("Physics \t "+this.marks[3]);
        System.out.println("Computer \t "+this.marks[4]);
        System.out.println(" \t \t \t Total: "+total);
        System.out.println(" \t \t \t Percent: "+percentage+" %");
        System.out.println(" \t \t \t Grade: "+finalgrade);


    }
}

