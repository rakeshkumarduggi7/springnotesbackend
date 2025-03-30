package com.springnotes.springnotes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Entity
public class allnotes {
    @Id
    String username;

    String notes;
    @CreationTimestamp
    LocalDateTime date;

    public allnotes() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
