package lesson13;

/**
 * @author Alex
 * @since 14.10.14
 */
public class Theme {
    private Long id;
    private String name;

    public Theme() {
    }

    public Theme(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
