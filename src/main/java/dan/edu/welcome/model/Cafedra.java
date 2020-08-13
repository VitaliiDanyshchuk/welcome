package dan.edu.welcome.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Cafedra {
    @Id
    private String id;
    private String name;
    private String chief;
    private LocalDateTime createdAt;
    private LocalDateTime modified;
    private String description;

    public Cafedra(){}

    public Cafedra(String id, String name, String chief, String description) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description =description ;
    }

    public Cafedra(String name, String chief, String description) {
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public Cafedra(String id, String name, String chief, String description,
                   LocalDateTime createdAt, LocalDateTime modified) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description = description;
        this.createdAt = createdAt;
        this.modified = modified;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public String toString() {
        return "Cafedra{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafedra cafedra = (Cafedra) o;
        return getId().equals(cafedra.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public void setUpdatedAt(LocalDateTime now) {
    }
}
