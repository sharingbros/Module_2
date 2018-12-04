package com.cg.gtf.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.gtf.entity.QueryMaster;
import com.cg.gtf.service.IGTFService;

@Controller
public class GTFController {

	@Autowired
	IGTFService service;
	QueryMaster queryMaster = null;

	@RequestMapping(value = "all")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "search", method = RequestMethod.GET)
	public ModelAndView search(@RequestParam("queryId") int id,Map<String, Object> model) {
		QueryMaster bean = null;
		/*List<String> myDeg = new ArrayList<>();
		myDeg.add("kowshik");
		myDeg.add("cardiologist");
		myDeg.add("eye specialist");
		model.put("deg", myDeg);*/
		bean = service.search(id);
		queryMaster = bean;
		if (bean == null)
			return new ModelAndView("error", "edata", id);
		else
			return new ModelAndView("update", "data", bean);
	}

	@RequestMapping(value = "success", method = RequestMethod.GET)
	public ModelAndView success(@RequestParam("solution") String solution,@RequestParam("name") String name) {
		queryMaster.setSolutions(solution);
		queryMaster.setSolution_Given_By(name);
		service.addQuery(queryMaster);
		return new ModelAndView("success", "data", queryMaster);
	}

}
