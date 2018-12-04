package com.cg.hba.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.hba.dto.HotelDetails;

@Repository("bookingDao")
public class BookingDAOImpl implements IBookingDAO{

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<HotelDetails> showAllHotels() {
		try{
		Query queryOne = entityManager.createQuery("FROM HotelDetails");
		List<HotelDetails> hotelList = queryOne.getResultList();

		return hotelList;
		}catch(Exception e){
			return null;
		}
	}
}
