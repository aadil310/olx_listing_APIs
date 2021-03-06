package com.olxListing.olxproject.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.olxListing.olxproject.entity.Listing;
import com.olxListing.olxproject.entity.User_Entity;

@Service
public interface ListingService {
	
	public ResponseEntity<String> addListing(Listing listing);
	
	public List<Listing> displayListings();

	public User_Entity displayContactDetails(int id);

	public Listing updateListing(Listing listing);

	public List<Listing> searchUsingCategory(String category) throws Exception;

	public List<Listing> searchUsingLocation(String city);

	public List<Listing> searchUsingPrice(int price);

	public List<Listing> sortListings();

}
