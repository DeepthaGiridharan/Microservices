package com.cognizant.favoriteservice.dao;

import com.cognizant.favoriteservice.exception.FavoriteEmptyException;
import com.cognizant.favoriteservice.model.Favorite;

public interface FavoriteDao {
	void addMovie(String userId, long movieId);
	

	Favorite getAllFavorites(String userId) throws FavoriteEmptyException;

	void removeFavorite(String userId, long movieId) throws FavoriteEmptyException;
}
