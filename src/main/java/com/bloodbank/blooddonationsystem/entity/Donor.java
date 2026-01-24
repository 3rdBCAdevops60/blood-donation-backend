package com.bloodbank.blooddonationsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Donor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String bloodGroup;
        private String city;
        private boolean available;

        // --- GETTERS AND SETTERS ---

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getBloodGroup() {
                return bloodGroup;
        }

        public void setBloodGroup(String bloodGroup) {
                this.bloodGroup = bloodGroup;
        }

        public String getCity() {
                return city;
        }

        public void setCity(String city) {
                this.city = city;
        }

        public boolean isAvailable() {
                return available;
        }

        public void setAvailable(boolean available) {
                this.available = available;
        }
}
