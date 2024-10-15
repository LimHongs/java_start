package construct.ex;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("","");
		book1.displayInfo();;

		Book book2 = new Book("Hello java","Seq");
		book2.displayInfo();

		Book book3 = new Book("JPA 프로그래밍", "kim",700);
		book3.displayInfo();
	}



}



/*
 * 제목: , 저자: , 페이지: 0 제목: Hello Java, 저자: Seo, 페이지: 0 제목: JPA 프로그래밍, 저자: kim,
 * 페이지: 700
 */