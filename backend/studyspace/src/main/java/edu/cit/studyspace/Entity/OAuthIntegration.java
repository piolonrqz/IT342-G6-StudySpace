package edu.cit.studyspace.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "OAuthIntegration")
public class OAuthIntegration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OAuthID;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private UserEntity user;

    @Column(nullable = false, length = 50)
    private String Provider;

    @Column(nullable = false)
    private String ProviderUserID;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String AccessToken;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String RefreshToken;

    @Column(nullable = false)
    private LocalDateTime ExpiresAt;

    public OAuthIntegration() {
    }

    public OAuthIntegration(UserEntity user, String Provider, String ProviderUserID, String AccessToken, String RefreshToken, LocalDateTime ExpiresAt) {
        this.user = user;
        this.Provider = Provider;
        this.ProviderUserID = ProviderUserID;
        this.AccessToken = AccessToken;
        this.RefreshToken = RefreshToken;
        this.ExpiresAt = ExpiresAt;
    }

    public int getOAuthID() {
        return OAuthID;
    }

    public UserEntity getUser() {
        return user;
    }

    public String getProvider() {
        return Provider;
    }

    public String getProviderUserID() {
        return ProviderUserID;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public String getRefreshToken() {
        return RefreshToken;
    }

    public LocalDateTime getExpiresAt() {
        return ExpiresAt;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    public void setProviderUserID(String ProviderUserID) {
        this.ProviderUserID = ProviderUserID;
    }

    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public void setRefreshToken(String RefreshToken) {
        this.RefreshToken = RefreshToken;
    }

    public void setExpiresAt(LocalDateTime ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }
}
