import java.util.ArrayList;

public class StudentInformationSystem {
    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();

        
        Student student1 = new Student(
                "uuid-101",
                "20261001",
                "12345678901",
                "Baris",
                "Yesildag",
                "2003-05-14",
                Gender.E,
                "baris.yesildag@atlas.edu.tr",
                "5551234567",
                "Istanbul, Turkey",
                "uuid-prog-01",
                2026,
                1,
                StudentStatus.aktif,
                "https://example.com/photos/baris.jpg",
                "2026-09-23"
        );

       
        studentList.add(student1);

        
        System.out.println("--- Kayitli ogrenci Listesi ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}