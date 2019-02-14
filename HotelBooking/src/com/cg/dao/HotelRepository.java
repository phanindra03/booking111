package com.cg.dao;

import java.util.List;

import com.cg.entity.hoteldetails;

public interface HotelRepository {
	public abstract List<hoteldetails> loadAll();
}
