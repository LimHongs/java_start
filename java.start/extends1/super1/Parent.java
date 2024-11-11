package extends1.super1;

public class Parent {
	// super - 부모 참조 부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면 자식에서 부모필드를 호출할수없지만 super 키워드 사용하면 호출 가능
	// this는 현재 내것을 가리키는것 super는 부모것 가르키는것

    public String value = "parent";

    public void hello() {
        System.out.println("Parent.hello");
    }
}
