package project.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.app.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}