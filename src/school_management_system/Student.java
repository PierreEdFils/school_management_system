package school_management_system;

/**
 *
 * This class is responsible for keeping the
 * track of students fees ,name ,grade & fees
 * paid.
 *
 */

public class Student {

    private int id;
    private  String name ;
    private int grade ;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new Student by initializing.
     * Fees for every student is 30,000.
     * Fees paid initially is 0.
     * @param id  id for the student unique.
     * @param name  name of the student.
     *@param grade grade of the student
     */
    public Student( int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    //Not going ti alter student's name, student's id


    /**
     * Used to update the student's grade.
     * @param grade new grade for the student.
     */

    public void setGrade(int grade){
        this.grade = grade;

    }

    /**
     *keep adding the fees paid
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     * @param fees  the fees that the student pays.
     */

    public void updateFeesPaid(int fees){
        feesPaid += fees;


    }


    /**
     *
     * return  the id of the Student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * return  the name of the Student.
     */
    public String getName() {
        return name;
    }


    /**
     *
     * return  the grade of the Student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * return  the fees paid of the Student.
     */

    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     *
     * return  the  total fees  of the Student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}
