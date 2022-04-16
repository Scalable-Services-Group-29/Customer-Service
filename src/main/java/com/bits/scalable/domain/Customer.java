package com.bits.scalable.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long customerId;

    @JsonProperty("customer_name")
    private String customerName;

    @JsonProperty("phone_number")
    private Long phoneNumber;

    @JsonProperty("email_id")
    private String emailId;

    @JsonProperty("address")
    private String address;
}

