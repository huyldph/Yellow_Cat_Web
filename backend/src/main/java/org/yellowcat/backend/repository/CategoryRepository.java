package org.yellowcat.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.yellowcat.backend.dto.response.CategoryResponse;
import org.yellowcat.backend.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
//    @Query("""
//                    SELECT new org.yellowcat.backend.dto.response.CategoryResponse(c.name, c.updatedAt)
//                    FROM Category c
//            """)
//    List<CategoryResponse> findAllCategories();
}
