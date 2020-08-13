package dan.edu.welcome.model;

import java.time.LocalDateTime;

public class Group {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt, updateAt;
    Cafedra cafedra;

    public Group () {} // empty constructor

    // Constructor all fields
    public Group(String id, String name, String description, LocalDateTime createdAt
            , LocalDateTime updateAt, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.cafedra = cafedra;
    }

    // Constructor without id
    public Group(String name, String description, LocalDateTime createdAt
            , LocalDateTime updateAt, Cafedra cafedra) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.cafedra = cafedra;
    }

    // Constructor without id createdAt modified
    public Group(String name, String description, Cafedra cafedra) {
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String description, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }
}
