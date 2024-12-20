package com.chatAppl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatAppl.model.Message;


public interface MessageRepository extends JpaRepository<Message, Long> {

	
}
