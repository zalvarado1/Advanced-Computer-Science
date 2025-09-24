public class Student{
    // Instance Variables
    private String name;
    private String id;
    private int grade;


    // Constructors
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student(String name){
    this.name = name;
    this.grade = 10;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    // setters
    public void setName(String newName){
        name = newName;
    }

    public void setGrade(int newGrade) {
        grade = newGrade;
    }

    public void setId(String newId) {
        id = newId;
    }

    // methods
    //Sandra is a 10th grade student. Their id is 123-4567.
    public String toString(){
        String sentence = name + " is a " + grade + " student. Their id is " + id + ".";
        return sentence;
    }

    public boolean equals(Student other){
        if(grade == other.grade && id.equals(other.id) && grade == other.grade){
            return true;
        }
        return false;
    }

    public String generateId(){
        double numbOne = Math.random() * 100;
        double numbTwo = Math.random() * 1000;
        int truncatedNumbOne = (int) numbOne;
        int truncatedNumbTwo = (int) numbTwo;
        String newId = truncatedNumbOne + "-" + truncatedNumbTwo;
        return newId;
    }


    
    

}