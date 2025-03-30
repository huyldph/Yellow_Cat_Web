package org.yellowcat.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.yellowcat.backend.dto.request.CategoryRequest;
import org.yellowcat.backend.dto.response.CategoryResponse;
import org.yellowcat.backend.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "updatedAt", source = "updatedAt")
    Category categoryRequestToCategory(CategoryRequest categoryRequest);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "createdAt", source = "createdAt")
    @Mapping(target = "updatedAt", source = "updatedAt")
    CategoryResponse categoryToCategoryResponse(Category category);
}
