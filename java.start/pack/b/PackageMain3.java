package pack.b;

import pack.a.User;

public class PackageMain3 {
	public static void main(String[] args) {
		pack.a.User userA = new User();
		pack.b.User userB = new pack.b.User();
	}
}
