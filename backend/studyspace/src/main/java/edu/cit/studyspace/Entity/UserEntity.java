package edu.cit.studyspace.Entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;
    private String Name;
    private String Email;
    private String Password;
    private String PhoneNumber;
    private boolean isEmailVerified;
    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BookingEntity> bookings;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<NotificationEntity> notifications;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OAuthIntegration> oauthIntegrations;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReservationEntity> reservationHistories;

    public UserEntity() {
    }

    public UserEntity(int UserID, String Name, String Email, String Password, String PhoneNumber, boolean isEmailVerified, LocalDateTime CreatedAt, LocalDateTime UpdatedAt) {
        this.UserID = UserID;
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.PhoneNumber = PhoneNumber;
        this.isEmailVerified = isEmailVerified;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    // Getters and Setters
    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public boolean isEmailVerified() {
        return isEmailVerified;
    }

    public void setEmailVerified(boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
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

    public List<BookingEntity> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingEntity> bookings) {
        this.bookings = bookings;
    }

    public List<NotificationEntity> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<NotificationEntity> notifications) {
        this.notifications = notifications;
    }

    public List<OAuthIntegration> getOauthIntegrations() {
        return oauthIntegrations;
    }

    public void setOauthIntegrations(List<OAuthIntegration> oauthIntegrations) {
        this.oauthIntegrations = oauthIntegrations;
    }

    public List<ReservationEntity> getReservationHistories() {
        return reservationHistories;
    }

    public void setReservationHistories(List<ReservationEntity> reservationHistories) {
        this.reservationHistories = reservationHistories;
    }
}