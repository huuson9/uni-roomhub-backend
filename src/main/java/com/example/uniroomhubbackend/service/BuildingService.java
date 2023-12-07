package com.example.uniroomhubbackend.service;

import com.example.uniroomhubbackend.model.Building;
import com.example.uniroomhubbackend.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildingService {

    private final BuildingRepository buildingRepository;

    @Autowired
    public BuildingService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    public List<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }

    public Building getBuildingById(Long id) {
        Optional<Building> building = buildingRepository.findById(id);
        return building.orElse(null);
    }

    public List<Building> getBuildingByName(String name) {
        return buildingRepository.findByName(name);
    }

}
