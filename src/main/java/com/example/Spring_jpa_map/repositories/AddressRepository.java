package com.example.Spring_jpa_map.repositories;

import com.example.Spring_jpa_map.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
