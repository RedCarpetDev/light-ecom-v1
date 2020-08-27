package org.ali.lightecomv1.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
@AllArgsConstructor @NoArgsConstructor @ToString @Data
public class Category implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String photo;
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;
}
