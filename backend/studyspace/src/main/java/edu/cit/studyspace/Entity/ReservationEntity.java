package edu.cit.studyspace.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ReservationEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservationHistoryID;
    private int UserID;
    private int BookingID;
    private String Status;
    private LocalDateTime CreatedAt;


    public ReservationEntity() {
    }


    public ReservationEntity(int ReservationHistoryID, int UserID, int BookingID, String Status, LocalDateTime CreatedAt) {
        this.ReservationHistoryID = ReservationHistoryID;
        this.UserID = UserID;
        this.BookingID = BookingID;
        this.Status = Status;
        this.CreatedAt = CreatedAt;
    }

    public int getReservationHistoryID() {
        return ReservationHistoryID;
    }

    public void setReservationHistoryID(int ReservationHistoryID) {
        this.ReservationHistoryID = ReservationHistoryID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int BookingID) {
        this.BookingID = BookingID;
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
}
