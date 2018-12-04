package com.cg.querymaster.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.querymaster.dto.QueryMaster;
import com.cg.querymaster.service.IQueryService;

@Controller
public class QueryController {

	@Autowired
	IQueryService queryService;
	
	@RequestMapping(value="all")
	public String getAll(){
		return "search";
	}
	
	@RequestMapping(value="dosearch",method=RequestMethod.GET)
	public ModelAndView search(@RequestParam("queryId") int id,@ModelAttribute("my") QueryMaster queryMaster,Map<String, Object> model){
		
		QueryMaster query=null; 
		query=queryService.search(id);
		//System.out.println(query);
		if(query==null){
			return new ModelAndView("noDataFound","query",id);
		}
		else{
			List<String> list=new ArrayList<>(); 
			   list.add("Uma");
			   list.add("Rahul");
			   list.add("kavita");
			   list.add("Hema");
			   model.put("solutionGiven",list);
			
			return new ModelAndView("success", "querydata", query);
		}
		}
	
	   @RequestMapping(value="update")
	   public ModelAndView update(@Valid@ModelAttribute("my") QueryMaster queryMaster,Map<String, Object> model,BindingResult result){
             
		     if(result.hasErrors()){
		    	 List<String> list=new ArrayList<>(); 
				   list.add("Uma");
				   list.add("Rahul");
				   list.add("kavita");
				   list.add("Hema");
				   model.put("solutionGiven",list);
				   return new ModelAndView("success", "querydata", model);
		     }
		     else{
		    	 boolean result1=queryService.update(queryMaster);
		         if(result1){
		        	 return new ModelAndView("updatesuccess","query",queryMaster.getQuery_id());
		         }
		         else{
		        	 return new ModelAndView("notUpdated","query",queryMaster.getQuery_id());
		         }
		     }
	   }
	  
	
}
