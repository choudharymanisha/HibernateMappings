package com.example.Spring_jpa_map.entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Transactional
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_id")
    private Long addressId;
    private String city;
    private String addressType;
    @ManyToOne
    @JoinColumn(name = "fk_emp_id")
    private Employee employee;

}
