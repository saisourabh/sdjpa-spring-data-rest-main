package guru.springframework.sfgrestbrewery.repositories;

import guru.springframework.sfgrestbrewery.domain.Temp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TempRepository extends JpaRepository<Temp, UUID> {
    Page<Temp> findAllByOrderByIdAsc(Pageable pageable);
}
