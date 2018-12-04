package com.cg.hba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hba.dao.IBookingDAO;
import com.cg.hba.dto.HotelDetails;

@Service("bookingService")
@Transactional
public class BookingServiceImpl implements IBookingService{

	@Autowired
	IBookingDAO bookingDao;

	@Override
	public List<HotelDetails> showAllHotels() {
		// TODO Auto-generated method stub
		return bookingDao.showAllHotels();
	}
	
	
}
