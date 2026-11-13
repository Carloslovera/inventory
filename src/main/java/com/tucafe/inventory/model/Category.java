package com.tucafe.inventory.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, length = 100)
private String name;

@Column(nullable = false, length = 500)
private String description;

@Column( name = "created_at", updatable = false)
private LocalDateTime createdAt;

@Column(name = "updated_at")
private LocalDateTime updatedAt;

@OneToMany(mappedBy = "category")
private List<Product> products;

@PrePersist
protected void onCreate() {
    createdAt = LocalDateTime.now();
    updatedAt = LocalDateTime.now();
}

@PreUpdate
protected void onUpdate() {
    updatedAt = LocalDateTime.now();
}

public Category ( String name, String description ) {
    this.name = name;
    this.description = description;
}

//getters and setters


}