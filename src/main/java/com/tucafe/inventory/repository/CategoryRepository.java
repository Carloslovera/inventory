package com.tucafe.inventory.repository;

import com.tucafe.inventory.model.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> finAll();
    // JpaRepository ya nos da métodos CRUD básicos:
                                        // save(), findById(), findAll(), deleteById(), etc.

                                        // Podemos agregar métodos personalizados:
                                        // List<Category> findByNameContaining(String name);
                                    }