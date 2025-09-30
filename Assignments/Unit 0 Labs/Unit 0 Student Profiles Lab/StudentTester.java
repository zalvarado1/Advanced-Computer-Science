public class StudentTester{
    public static void main(String[] args) {
        Student zayra = new Student("Zayra", 10); // 1/2 studentsusing 2 parameter student object

        Student nick = new Student("Nick", 10); // 2/2 student using 2 parameter student object

        Student kendall = new Student("Kendall"); // 1/2 student using 1 parameter student object

        Student vasco = new Student("Vasco"); // 2/2 student using 1 paramter student object

        System.out.println(zayra.toString()); // 1/4 student details using tostring

        System.out.println(nick.toString()); // 2/4 student details using tostring


        System.out.println(kendall.toString()); // 3/4 student details using tostring


        System.out.println(vasco.toString()); // 4/4 student details using tostring


        zayra.setGrade(11); // 1/4 student changing grade

        nick.setGrade(11); // 2/4 student changing grade

        kendall.setGrade(11); // 3/4 student changing grade

        vasco.setGrade(11); // 4/4 student changing grade

        System.out.println(nick.equals(zayra)); // comparing 2 students

        
    }
}