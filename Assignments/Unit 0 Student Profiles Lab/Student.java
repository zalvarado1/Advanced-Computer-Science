public class Student{
    // Instance Variables
    private String name;
    private int id;
    private int grade;


    // Constructors
    public Student (String name, int grade){
            name = "Zayra";
            id = 12345;
            grade = 9;
    }

    // getters
    
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int grade(){
        return grade;
    }

    // setters
    public String setName(String newName){
        this.name = newName;
        return name;
    }
    public int getId(int newId) {
        this.id = newId;
        return id;
    }
    public int getGrade(int newGrade) {
        this.grade = newGrade;
        return grade;
    }

    // methods
    public String toString(){
        return (name +" is a " + grade + "th grade student. Their id is " + id);
    }
    public boolean equals(other.)
    

}