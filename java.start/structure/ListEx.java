package structure;

public class ListEx {
    public static void main(String[] args) {
        // double[] scores = {85.5, 90.0, 78.0, 92.5, 88.0};  다음 배열을 사용하여 배열 평균을 계산하는 프로그램 작성

        double[] scores = {85.5, 90.0, 78.0, 92.5, 88.0};

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        double average = sum / scores.length;
        System.out.println("배열의 평균" + average);

    }
}
