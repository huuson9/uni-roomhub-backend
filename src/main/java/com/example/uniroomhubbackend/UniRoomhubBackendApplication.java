package com.example.uniroomhubbackend;

import com.example.uniroomhubbackend.model.Room;
import com.example.uniroomhubbackend.repository.RoomRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class UniRoomhubBackendApplication {

    public static void main(String[] args) {
        // ApplicationContext chứa toàn bộ dependency trong project.
        SpringApplication.run(UniRoomhubBackendApplication.class, args);


    }

}
