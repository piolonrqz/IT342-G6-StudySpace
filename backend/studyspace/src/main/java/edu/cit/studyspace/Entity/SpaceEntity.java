package edu.cit.studyspace.Entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class SpaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SpaceID;
    private String Name;
    private String Type;
    private String Location;
    private float Price;
    private int Capacity;
    private boolean Availability;
    private LocalDateTime UpdatedAt;
    private LocalDateTime CreatedAt;
    private String Amenities;

    @ManyToOne
    @JoinColumn(name = "AdminID", nullable = false)
    private AdminEntity admin;

    @OneToMany(mappedBy = "space", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BookingEntity> bookings;

    public SpaceEntity() {
    }

    public SpaceEntity(int SpaceID, String Name, String Type, String Location, float Price, int Capacity, boolean Availability, LocalDateTime UpdatedAt, LocalDateTime CreatedAt, String Amenities) {
        this.SpaceID = SpaceID;
        this.Name = Name;
        this.Type = Type;
        this.Location = Location;
        this.Price = Price;
        this.Capacity = Capacity;
        this.Availability = Availability;
        this.UpdatedAt = UpdatedAt;
        this.CreatedAt = CreatedAt;
        this.Amenities = Amenities;
    }

    // Getters and Setters
    public int getSpaceID() {
        return SpaceID;
    }

    public void setSpaceID(int SpaceID) {
        this.SpaceID = SpaceID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public String getAmenities() {
        return Amenities;
    }

    public void setAmenities(String Amenities) {
        this.Amenities = Amenities;
    }

    public AdminEntity getAdmin() {
        return admin;
    }

    public void setAdmin(AdminEntity admin) {
        this.admin = admin;
    }

    public List<BookingEntity> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingEntity> bookings) {
        this.bookings = bookings;
    }
}