package io.rajivsingh.ratingsdataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rating")
public class RatingResource {

	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId)
	{
		return new Rating(movieId,8);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable String userId)
	{
		 
		List<Rating> ratingList =		Arrays.asList(
						new Rating("Ra1",7),
						new Rating("HWG90",10)
						);
		
		UserRating userRating=new UserRating();
		userRating.setUserRating(ratingList);
		return userRating;
		
		
	}
}
