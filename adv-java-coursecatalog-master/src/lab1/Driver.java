package lab1;

import lab2.IntroJavaCourse;

public class Driver {

    public static void main(String[] args) {

        AdvancedJavaCourse aJC = new AdvancedJavaCourse("Advanced Java","2");
        IntroJavaCourse iJC = new IntroJavaCourse("Java","1");
        IntroToProgrammingCourse iPC = new IntroToProgrammingCourse("Introduction Programming","4");

        System.out.println(aJC.getCourseName());
        System.out.println(iJC.getCourseNumber());
        System.out.println(iPC.getCourseName());


    }
}
