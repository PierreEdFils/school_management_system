package school_management_system;


import java.util.List;

/**
 * Many teachers , many students.
 * Implements teachers and students
 * using an Arraylist
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private  int totalMoneyEarned;
    private  int totalMoneySpent;

    /**
     * new school object created
     * @param teachers
     * @param students
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned =0;
        totalMoneySpent=0;
    }

    /**
     *
     * return the list of the teachers in the school.
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * @param teacher
     */


    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);

    }

    /**
     * *
     * @return the list of the students of the school.
     */

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student) ;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
