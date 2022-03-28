public class Student {

    private final String name;
    private final String secretNickName = "MySecretNickName";
    private int grade;
    private int group;

    private static final String validGrades = "ABCDEF";
    private static final int minGroup = 1;
    private static final int maxGroup = 5;

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

    public String getName() {
        return name;
    }

    private String getSecretNickName() {
        return secretNickName;
    }

    public char getGrade() {
        return validGrades.charAt(grade);
    }

    public int getGroup() {
        return group;
    }

    public void upgrade(){
        // move nearer to 0
        if (grade > 1)
            grade--;
    }

    public void downgrade(){
        // move further from 0
        if (grade < validGrades.length() - 1)
            grade++;
    }
}
