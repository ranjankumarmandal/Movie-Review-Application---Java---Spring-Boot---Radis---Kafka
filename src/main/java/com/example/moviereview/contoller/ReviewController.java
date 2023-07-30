package com.example.moviereview.contoller;

import com.example.moviereview.service.request.ReviewRequest;
import com.example.moviereview.service.response.ReviewResponse;
import com.example.moviereview.service.utils.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public void addReview(@RequestBody ReviewRequest reviewRequest){
        reviewService.addReview(reviewRequest.toReview());
    }

    @GetMapping("/find")
    public ReviewResponse getReview(@RequestParam Long reviewId){
        return reviewService.getReviewById(reviewId);
    }
}
