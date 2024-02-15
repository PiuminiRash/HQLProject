package Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table
@Entity

public class Book {
    @Id
    private String id;
    private String title;
    private int publicationYear;
    private double price;
    @ManyToOne @JoinColumn(name = "authorId")
    private Author author;
}
