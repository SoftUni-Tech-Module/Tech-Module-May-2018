package softuniBabies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBabies.entity.Baby;

public interface BabyRepository extends JpaRepository<Baby, Integer> {
}
