package lesson13;

import java.util.Date;

/**
 * @author Alex
 * @since 07.10.14
 */
public class ForumUser {
    private String username;
    private String lastname;
    private String email;
    private Date registration;
    private Integer rating;

    public ForumUser() {
    }

    public ForumUser(String username, String lastname, String email, Date registration, Integer rating) {
        this.username = username;
        this.lastname = lastname;
        this.email = email;
        this.registration = registration;
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", registration=" + registration +
                ", rating=" + rating +
                '}';
    }
}
