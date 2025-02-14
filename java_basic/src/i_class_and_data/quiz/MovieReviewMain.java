package i_class_and_data.quiz;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "라라랜드";
        movieReview1.review = "인생영화!! 완전 띵작";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃타임";
        movieReview2.review = "인생 시간 영화!!";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for(MovieReview mr : movieReviews){
            System.out.println("영화 제목: " + mr.title
            + " 리뷰: " + mr.review);
        }

    }
}
