package org.ali.lightecomv1.entities.dao;

import org.ali.lightecomv1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(path = "cat")
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
