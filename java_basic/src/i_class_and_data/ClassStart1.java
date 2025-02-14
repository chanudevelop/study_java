package i_class_and_data;

public class ClassStart1 {
    public static void main(String[] args) {

        // 잘못된 방법 1- 변수 사용
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("잘못된 방법1- 변수 사용");
        System.out.println("학생이 늘어날 때 마다 변수를 추가로 선언해야하고, 출력하는 코드도 추가해야한다.");
        System.out.println("이름: " + student1Name + ", 나이: " + student1Age + ", 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + ", 나이: " + student2Age + ", 성적: " + student2Grade);
        System.out.println("------------------------------------------------------------");

        // 잘못된 방법 2- 배열 사용
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        System.out.println("잘못된 방법2- 배열 사용");
        System.out.println("배열을 사용해서, 학생이 추가되어도, 변수를 추가적으로 생성하지 않고 배열에 학생의 데이터만 추가하면 된다");
        System.out.println("또한 출력 부분의 코드도 그대로 유지할 수 있다.");
        System.out.println("하지만, 한 학생의 데이터가 여러 배열에 나누어져있다(이름, 나이, 성적 각각)");
        System.out.println("그렇기에 데이터를 변경할 떄 매우 조심해서 작업해야한다.");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + ", 나이: " + studentAges[i] + ", 성적: " + studentGrades[i]);
        }
        System.out.println("------------------------------------------------------------");


        System.out.println("'학생' 이라는 개념을 하나로 묶어서 각각의 학생 별로 본인의 이름, 나이, 성적을 관리하는 것이 좋다");
    }
}
