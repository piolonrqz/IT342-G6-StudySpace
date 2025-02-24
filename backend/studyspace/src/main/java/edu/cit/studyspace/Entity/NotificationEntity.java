package edu.cit.studyspace.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NotificationEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int NotificationID;
    private int UserID;
    private int BookingID;
    private String Type;
    private String Message;
    private LocalDateTime SentAt;

    public NotificationEntity() {
        // Default constructor
    }

    public NotificationEntity(int NotificationID, int UserID, int BookingID, String Type, String Message, LocalDateTime SentAt) {
        this.NotificationID = NotificationID;
        this.UserID = UserID;
        this.BookingID = BookingID;
        this.Type = Type;
        this.Message = Message;
        this.SentAt = SentAt;
    }

    public int getNotificationID() {
        return NotificationID;
    }

    public void setNotificationID(int NotificationID) {
        this.NotificationID = NotificationID;
    }

    public int getUserID() {
        return UserID;  // FIXED: Now correctly returns UserID
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

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public LocalDateTime getSentAt() {
        return SentAt;
    }

    public void setSentAt(LocalDateTime SentAt) {
        this.SentAt = SentAt;
    }
}
