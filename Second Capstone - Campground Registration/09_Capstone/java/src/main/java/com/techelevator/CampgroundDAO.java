package com.techelevator;

import java.util.Date;
import java.util.List;

public interface CampgroundDAO {

	List<Campground> createListOfAllCampgrounds(Park park);
	List<Campground> displayListOfAllCampgrounds(List <Campground> campgroundList);

}
