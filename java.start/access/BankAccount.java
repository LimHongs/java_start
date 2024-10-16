package access;
// 캡슐화 : 내부에서 검증이 가능한거는 private (데이터가 넘어가는걸 방지하기위해 )밖으로 내보내거나 출력을하는거는 public
public class BankAccount {
	private int balance;

	public BankAccount() {
		balance = 0;
	}

	public void deposit(int amount) {
		if (isAmountValid(amount)) {
			balance += amount;
		} else {
			System.out.println("유효하지 않은 금액입니다");
		}
	}

	public void withdraw(int amount) {
		if (isAmountValid(amount) && balance - amount >= 0) {
			balance -= amount;
		} else {
			System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
		}
	}

	public int getBalnace() {
		return balance;
	}
	// true 이면 deposit false이면 withdraw로 이동
	private boolean isAmountValid(int amount) {
		return amount > 0;
	}
}
