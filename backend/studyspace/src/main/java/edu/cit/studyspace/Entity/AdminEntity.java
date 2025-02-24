package edu.cit.studyspace.Entity;

import java.time.LocalTime;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AdminID;
    private String Name;
    private String Email;
    private String Password;
    private LocalTime CreatedAt;
    private LocalTime UpdatedAt;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SpaceEntity> spaces;

    public AdminEntity() {
        super();
    }

    public AdminEntity(int AdminID, String Name, String Email, String Password, LocalTime CreatedAt, LocalTime UpdatedAt) {
        this.AdminID = AdminID;
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }

    // Getters and Setters
    public int getAdminID() {
        return AdminID;
    }

    public void setAdminID(int AdminID) {
        this.AdminID = AdminID;
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

    public LocalTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalTime CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public LocalTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalTime UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public List<SpaceEntity> getSpaces() {
        return spaces;
    }

    public void setSpaces(List<SpaceEntity> spaces) {
        this.spaces = spaces;
    }
}