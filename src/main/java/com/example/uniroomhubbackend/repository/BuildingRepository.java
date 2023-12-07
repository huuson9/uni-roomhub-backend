package com.example.uniroomhubbackend.repository;

import com.example.uniroomhubbackend.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Long> {
    List<Building> findByName(String name);
    // Có thể thêm các phương thức tùy chỉnh khác nếu cần thiết
}
