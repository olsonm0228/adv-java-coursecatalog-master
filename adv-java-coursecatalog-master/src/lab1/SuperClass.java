package lab1;

import javax.swing.*;

//should be named course
public class SuperClass {

    private String courseName;
    private String courseNumber;
    private double credits;

    public SuperClass(String courseName, String courseNumber, int credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    public final String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;    }
}
