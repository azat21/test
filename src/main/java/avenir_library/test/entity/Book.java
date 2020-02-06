package avenir_library.test.entity;


import avenir_library.test.enums.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(name = "quantity")
    private Integer quantity;
}