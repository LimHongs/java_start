package extends1.ex;

public class Movie extends Item {
	private String director;
	private String actor;

	public Movie(String name, int price, String direcotr, String actor) {
		super(name, price);
		this.director = direcotr;
		this.actor = actor;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("- 감독:" + director + ", 배우" + actor);
	}
}
