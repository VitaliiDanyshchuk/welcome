package dan.edu.welcome.model;

import java.time.LocalDateTime;

public class Examination {
    private String id;
    Student student;
    private int mark;
    private String subject;
    private LocalDateTime datetime;
    LocalDateTime createdAt;
    LocalDateTime modified;

    public Examination() {}
    public Examination(String id, Student student, int mark, String subject,
                       LocalDateTime datetime, LocalDateTime createdAt,
                       LocalDateTime modified) {
        this.id = id;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.datetime = datetime;
        this.createdAt = createdAt;
        this.modified = modified;
    }

    public Examination(Student student, int mark, String subject,
                       LocalDateTime datetime, LocalDateTime createdAt,
                       LocalDateTime modified) {
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.datetime = datetime;
        this.createdAt = createdAt;
        this.modified = modified;
    }

    public Examination(Student student, int mark, String subject,
                       LocalDateTime datetime) {
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.datetime = datetime;
    }
}
