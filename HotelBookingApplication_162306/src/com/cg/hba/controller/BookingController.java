package com.cg.hba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hba.dto.HotelDetails;
import com.cg.hba.service.IBookingService;

@Controller
public class BookingController {

	@Autowired
	IBookingService bookingService;

	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	void handleException() {

	}

	@RequestMapping(value = "hoteldetails", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<HotelDetails> hotelDetails = bookingService.showAllHotels();
		if (hotelDetails != null) {
			return new ModelAndView("HotelDetails", "hotel", hotelDetails);
		} else {
			return new ModelAndView("NoDataFound");
		}
	}

	@RequestMapping(value = "booking", method = RequestMethod.GET)
	public ModelAndView bookingconfirmation(@RequestParam("name") String name) {
		return new ModelAndView("BookingConfirmation", "name", name);
	}

}
