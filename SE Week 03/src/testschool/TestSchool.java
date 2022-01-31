/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testschool;

/**
 *
 * @author ioneill
 */
public class TestSchool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Teacher teacher1 = new Teacher();
    Parent parent1 = new Parent();
    ParentTeacher pt1 = new ParentTeacher();

    teacher1.setTeacherName("Fred");
    parent1.setParentName("Bill");
    pt1.setTeacherName("Miss Jennifer Teacher");
    pt1.setParentName("Jenny");

    System.out.println("Teacher = " +
					teacher1.getTeacherName());
    System.out.println("Parent = " +
					parent1.getParentName());
    System.out.println("Parent-Teacher Teacher-Name  = "
					+ pt1.getTeacherName());
    System.out.println("Parent-Teacher Parent-Name = "
					+ pt1.getParentName());
    }

}
