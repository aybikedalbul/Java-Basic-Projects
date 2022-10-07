public class OBS {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Aybike","9532432188","TRH");
        Teacher t2 = new Teacher("Graham Bell" , "6465416" , "FZK");
        Teacher t3 = new Teacher("Külyutmaz","52614","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

       Student s1 = new Student("İnek Şaban" , "123" , "4",tarih,fizik,biyo);
       s1.addBulkExamNote(100,70,50);
       s1.isPass();

       Student s2 = new Student("Güdük Necmi" , "444","4",tarih,fizik,biyo);
       s2.addBulkExamNote(50,30,70);

    }
}

class Teacher{
    String name;
    String mpno;
    String brnach;

    public Teacher(String name, String mpno, String brnach){
        this.name = name;
        this.mpno = mpno;
        this.brnach = brnach;
    }
    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Branşı: " + this.brnach);
    }
}

class Course{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.brnach.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
class Student{
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo,String classes,Course c1,Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
    }

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.avarage > 55){
            System.out.println("Hababam sınıfı uyanıyor.");
            this.isPass = true;
        }
        else{
            System.out.println("HAbabam sınıfı sınıfta kaldı.");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println("================================");
        System.out.println(c1.name + " Notu: " + c1.note);
        System.out.println(c2.name + " Notu: " + c2.note);
        System.out.println(c3.name + " Notu: " + c3.note);
        System.out.println("Ortalamanız: " + this.avarage);
    }



}








