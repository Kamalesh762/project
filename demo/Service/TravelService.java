package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.TravelRepo;
import com.example.demo.Model.TravelModel;
@Service

public class TravelService
{
	@Autowired
    public TravelRepo crepo;
	
	public TravelModel saveInfo(TravelModel c)
	{
		return crepo.save(c);
	}
	public List<TravelModel> getInfo()
	{
		return crepo.findAll();
	}
	public TravelModel updateInfo(TravelModel iu)
	{
		return crepo.saveAndFlush(iu);
		
	}
	public void deleteInfo(int id )
	{
		crepo.deleteById(id);
	}
}