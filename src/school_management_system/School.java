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
     * @return the list of the students in the school.
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student) ;
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned moneuy
     */

    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school. .
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school by its teachers.
     * @param MoneySpent
     */
    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent -=MoneySpent;
    }
}
