package com.tucafe.inventory.repository;

import com.tucafe.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository ya nos da métodos CRUD básicos:
    // save(), findById(), findAll(), deleteById(), etc.

    // Podemos agregar métodos personalizados:
    // List<Product> findByNameContaining(String name);
}