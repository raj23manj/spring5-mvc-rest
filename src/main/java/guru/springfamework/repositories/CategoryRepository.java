package guru.springfamework.repositories;

import guru.springfamework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // query methods/dynamic finders
    Category findByName(String name);
}