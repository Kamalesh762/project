package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.TravelModel;

public interface TravelRepo extends JpaRepository<TravelModel,Integer> {

}
