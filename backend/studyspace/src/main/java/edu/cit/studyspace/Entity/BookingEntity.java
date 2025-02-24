package edu.cit.studyspace.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookingEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BookingID;
    private int UserID;
    private int SpaceID;
    private LocalDateTime StartTime;
    private LocalDateTime EndTime;
    private String Status;
    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;

    public BookingEntity() {
    }

    public BookingEntity(int BookingID, int UserID, int SpaceID, LocalDateTime StartTime, LocalDateTime EndTime, String Status, LocalDateTime CreatedAt, LocalDateTime UpdatedAt) {
        this.BookingID = BookingID;
        this.UserID = UserID;
        this.SpaceID = SpaceID;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.Status = Status;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int BookingID) {
        this.BookingID = BookingID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public int getSpaceID() {
        return SpaceID;
    }

    public void setSpaceID(int SpaceID) {
        this.SpaceID = SpaceID;
    }

    public LocalDateTime getStartTime() {
        return StartTime;
    }

    public void setStartTime(LocalDateTime StartTime) {
        this.StartTime = StartTime;
    }

    public LocalDateTime getEndTime() {
        return EndTime;
    }

    public void setEndTime(LocalDateTime EndTime) {
        this.EndTime = EndTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }
}
