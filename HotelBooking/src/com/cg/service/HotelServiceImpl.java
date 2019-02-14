package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.dao.HotelRepository;
import com.cg.entity.hoteldetails;
@Service
@Transactional
public class HotelServiceImpl implements HotelService{
	@Autowired
	private HotelRepository hotelRepository;
	@Override
	public List<hoteldetails> loadAll() {
		
		return hotelRepository.loadAll();
	}

}
