package com.tinqin.library.book.persistence.models;


import com.tinqin.library.book.persistence.enums.BookStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
@Entity
@Table(name="book")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id", nullable = false)
    private UUID id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="autor", nullable = false)
    private String author;

    @Column(name = "pages", nullable = false)
    private String  pages;

    @Column(name="price", nullable = false)
    private Double price;

    @Column(name="price_per_rent", nullable = false)
    private Double pricePerRent;


    @Column(name ="stock",nullable = false)
    private Integer stock;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Column(name = "is_deleted",nullable = false)
    private Boolean isDeleted;

    @Column(name = "book_status",nullable = false)
    @Enumerated(EnumType.STRING)
    private BookStatus bookStatus;


//    @OneToMany(mappedBy = "book", cascade =CascadeType.ALL )
//    List<BookRental>rentals;
//
//    @ManyToOne
//    @JoinColumn(name="author_id")
//    private User author;
//
//   // @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
//    //category
//    @ManyToMany
//    @JoinTable(
//            name = "category",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "category_id")
//    )
//    private List<Category> categories;





}
