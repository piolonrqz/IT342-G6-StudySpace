package edu.cit.studyspace.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CalendarIntegration")
public class CalendarIntegration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CalendarID;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "BookingID", nullable = false)
    private BookingEntity booking;

    @Column(nullable = false)
    private String EventID;

    @Column(nullable = false)
    private LocalDateTime CreatedAt;

    public CalendarIntegration() {
    }

    public CalendarIntegration(UserEntity user, BookingEntity booking, String EventID, LocalDateTime CreatedAt) {
        this.user = user;
        this.booking = booking;
        this.EventID = EventID;
        this.CreatedAt = CreatedAt;
    }

    public int getCalendarID() {
        return CalendarID;
    }

    public UserEntity getUser() {
        return user;
    }

    public BookingEntity getBooking() {
        return booking;
    }

    public String getEventID() {
        return EventID;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setBooking(BookingEntity booking) {
        this.booking = booking;
    }

    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    public void setCreatedAt(LocalDateTime CreatedAt) {
        this.CreatedAt = CreatedAt;
    }
}
