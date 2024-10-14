package ref.ex;

import java.util.Iterator;
import java.util.Scanner;

import classEx.ProductOrder;

public class ProductOrderMain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 주문의 개수를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();

		ProductOrder[] orders = new ProductOrder[n];

		for (int i = 0; i < orders.length; i++) {
			System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

			System.out.print("상품명: ");
			String productName = sc.nextLine();

			System.out.print("가격: ");
			int price = sc.nextInt();

			System.out.print("수량: ");
			int quantity = sc.nextInt();
			sc.nextLine();

			orders[i] = createOder(productName,price,quantity);

		}
		printOrders(orders);
		int totalAmount =getTotalAmount(orders);
		System.out.println("총 결제 금액: " + totalAmount);
	}

		static ProductOrder createOder(String productName, int price, int quantity) {

			ProductOrder order1 = new ProductOrder();
			order1.productName = productName;
			order1.price = price;
			order1.quantity = quantity;
			return order1;

		}

		static void printOrders(ProductOrder[] orders) {
			for(ProductOrder order : orders) {
				System.out.println("상품명: " + order.productName + ",가격: " + order.price + ",수량: " + order.quantity);
			}
		}

		static int getTotalAmount(ProductOrder[] orders) {
			int totalAmount = 0;
			for (ProductOrder order : orders) {
				totalAmount += order.price * order.quantity;
			}
			return totalAmount;
		}

}