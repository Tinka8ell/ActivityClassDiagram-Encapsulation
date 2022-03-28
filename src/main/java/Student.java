public class Student {

    private final String name;
    private final String secretNickName = "MySecretNickName";
    private int grade;
    private int group;

    private static final String validGrades = "ABCDEF";
    private static final int minGroup = 1;
    private static final int maxGroup = 5;

    /**
     * Student class.
     * A well-encapsulated class of students, their grades and groups.
     *
     * @param name of student as String
     * @param gradeLetter of student as char
     * @param group of student as integer
     */
    public Student(String name, char gradeLetter, int group) {
        this.name = name;
        this.grade = validGrades.indexOf(gradeLetter);
        this.group = group;
        // make sure we reject invalid grades
        if (grade < 0)
            throw new IllegalArgumentException("Grade letter of '" + gradeLetter + "' is not a valid grade");
        // make sure we reject invalid groups
        if (group < minGroup || group > maxGroup)
            throw new IllegalArgumentException("Group '" + group + "' is not a valid group");
    }

    /**
     * Getter for student name with no access to student secret nickname.
     *
     * @return name of student as String
     */
    public String getName() {
        return name;
    }

    /**
     * Inaccessible getter for student secret nickname!
     *
     * @return student's secret nickname as String
     */
    private String getSecretNickName() {
        return secretNickName;
    }

    /**
     * Getter for student grade.
     *
     * @return student's grade as a char value
     */
    public char getGrade() {
        return validGrades.charAt(grade);
    }

    /**
     * Getter for student group.
     *
     * @return student's group as an Integer
     */
    public int getGroup() {
        return group;
    }

    /**
     * Method to upgrade a student's grade by one point.
     * Will maintain grade in the valid range.
     */
    public void upgrade(){
        // move nearer to 0
        if (grade > 1)
            grade--;
    }

    /**
     * Method to downgrade a student's grade by one point.
     * Will maintain grade in the valid range.
     */
    public void downgrade(){
        // move further from 0
        if (grade < validGrades.length() - 1)
            grade++;
    }
}
