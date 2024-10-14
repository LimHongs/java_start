package class1;

public class ClassStart3 {

	public static void main(String[] args) {
		Student student1;
		// student1 = new Student(); 메모리에 학생이란 변수를 생성
		student1 = new Student();
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;

		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		System.out.println("이름: " + student1.name + "나이:" + student1.age + " 성적" + student1.grade);
		System.out.println("이름: " + student2.name + "나이:" + student2.age + " 성적" + student2.grade);

		// class 사용자가 직접 정의하고 정의 타입을 만들수있는 공간
		// 클래스를 사용해서 실제 메모리안에 만들어진 객체를 인스턴스
		// Object 객체 : 클래스에서 정의한 속성과 기능 실체
		// 인스턴스 : 특정 클래스로부터 생성된 객체
		// student1은 student 객체이고 student1은 student 인스턴스이다
		System.out.println(student1);
		System.out.println(student2);
	}

}
