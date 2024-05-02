package guru.springframework.sfgrestbrewery.repositories;

import guru.springframework.sfgrestbrewery.domain.Temp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "temp", collectionResourceRel = "temp")
public interface TempRepository extends JpaRepository<Temp, UUID> {
    Page<Temp> findAllByOrderByIdAsc(Pageable pageable);
}
