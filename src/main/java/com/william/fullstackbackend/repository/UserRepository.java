package com.william.fullstackbackend.repository;

import com.william.fullstackbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {


}