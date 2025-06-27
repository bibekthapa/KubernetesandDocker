package com.dcoker.deloy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcoker.deloy.model.Message;

public interface MessageRepository extends JpaRepository<Message,Long> {
    
}
