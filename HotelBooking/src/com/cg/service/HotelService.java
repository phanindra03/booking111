package com.cg.service;

import java.util.List;

import com.cg.entity.hoteldetails;

public interface HotelService {
	public abstract List<hoteldetails> loadAll();
}
