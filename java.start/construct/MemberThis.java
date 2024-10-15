package construct;

public class MemberThis {
	String nameField;
		//this.  이름이 중복될경우 사용하는게 좋다
	void initMember(String nameParameter) {
		this.nameField = nameParameter;
	}
}
