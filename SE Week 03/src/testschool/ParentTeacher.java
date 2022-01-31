/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testschool;

/**
 *
 * @author ioneill
 */
public class ParentTeacher extends Parent implements TeacherInterface {
    private String teacherName="";

	public void setTeacherName(final String pname)
	{	teacherName = pname;
	}

	public String getTeacherName()
	{ return teacherName;
	}
}
