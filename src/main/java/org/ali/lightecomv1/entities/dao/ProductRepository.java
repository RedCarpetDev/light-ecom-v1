package org.ali.lightecomv1.entities.dao;

import org.ali.lightecomv1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource(path = "prod")
public interface ProductRepository extends JpaRepository<Product,Long> {
    @RestResource(path = "/selectedProducts")
    public List<Product> findProductsBySelectedIsTrue();
    @RestResource(path = "/productsByKeyword")
    public List<Product> findProductsByNameContains(@Param("mc")String mc);
    @RestResource(path = "/promoProducts")
    public List<Product> findProductsByPromotionIsTrue();
    @RestResource(path = "/dispoProducts")
    public List<Product> findProductsByAvailableIsTrue();


    /*@RestResource(path = "/productsByKeyword")
    @Query("select p from Product p where p.name like :x")
    public List<Product> chercher(@Param("x") String mc);*/
}
