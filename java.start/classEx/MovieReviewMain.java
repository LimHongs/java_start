package classEx;

import class1.Student;

public class MovieReviewMain {

	public static void main(String[] args) {
		MoviceReview Movie1 = new MoviceReview();
		Movie1.title = "인셉션";
		Movie1.review = "인생은 무한 루프";

		MoviceReview Movie2 = new MoviceReview();
		Movie2.title = "어바웃 타임";
		Movie2.review = "인생 시간 영화!";

		MoviceReview[] Movies = new MoviceReview[] {Movie1,Movie2};

		for(int i = 0; i < Movies.length; i++) {
			System.out.println("영화 제목: " +  Movies[i].title + " 리뷰: " +Movies[i].review );
		}



	}

}
