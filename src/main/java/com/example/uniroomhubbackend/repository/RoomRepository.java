package com.example.uniroomhubbackend.repository;

import com.example.uniroomhubbackend.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    // Có thể thêm các phương thức tùy chỉnh khác nếu cần thiết
}
