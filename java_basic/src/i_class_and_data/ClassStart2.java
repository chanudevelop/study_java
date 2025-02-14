package i_class_and_data;

public class ClassStart2 {
    public static void main(String[] args) {

        // 학생 클래스 각각 생성
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);

        // 학생 클래스 배열을 만들어서 반복되어 작성되는 출력 코드를 줄일 수 있다.
        Student[] students = new Student[]{student1, student2};
        // Student[] students = {student1, student2}; 형태로 줄일 수 있다.

        // for문 최적화

        for(int i = 0; i<students.length; i++){
            System.out.println("이름: " + students[i].name + ", 나이: " + students[i].age + ", 성적: " + students[i].grade);
        }
        // 반복 요소를 변수에 담아서 처리
        for(int i = 0; i< students.length; i++){
            Student s = students[i];
        }
        //향상된 for ans
        for(Student s : students){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }


    }
}
