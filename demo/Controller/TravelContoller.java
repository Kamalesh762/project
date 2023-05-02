package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.TravelModel;
import com.example.demo.Service.TravelService;


@RestController

public class TravelContoller
{
	@Autowired
	public TravelService cser;
		
	@PostMapping("/postm")
	public TravelModel addDetails(@RequestBody TravelModel cr)
	{
		return cser.saveInfo(cr);
	}
	@GetMapping("/getma")
	public List <TravelModel> getDetails()
	{
		return cser.getInfo();
	}
	
	@PutMapping("/putma")
	public TravelModel updateDetails(@RequestBody TravelModel travelnum)
	{
		return cser.updateInfo(travelnum);
	}
	
	@DeleteMapping("delete/{cid}")
	public String deleteDetails (@PathVariable ("cid") int travelnum)
	{
		cser.deleteInfo(travelnum);
		return "travel number "+travelnum+" is deleted";
				
	}
	@DeleteMapping("/delete")
	public String deleteByReq(@RequestParam ("cid") int travelnum)
	{
		cser.deleteInfo(travelnum);
		return "Travel number "+travelnum+" is deleted";
	}
}