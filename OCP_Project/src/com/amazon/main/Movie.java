package com.amazon.main;

import java.util.ArrayList;

public class Movie {

	private int movieId;
	private float rating;
	private ArrayList<Movie> similarMovies;

	public Movie(int movieId, float rating) {
		this.movieId = movieId;
		this.rating = rating;
	}

	public int getId() {
		return movieId;
	}

	public void setId(int movieId) {
		this.movieId = movieId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public ArrayList<Movie> getSimilarMovies() {
		return similarMovies;
	}

	public void addSimilarMovies(Movie similarMovies) {
		this.similarMovies.add(similarMovies);
	}

}
