package com.example.sprint.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.PrinterURI;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Post {
    private Integer post_id;
    private LocalDate date;
    private Product product;
    private Category category;
    private Double price;
}
