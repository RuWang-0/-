package dao;

import entity.Label;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LabelDao extends JpaRepository<Label,Integer> {
}
