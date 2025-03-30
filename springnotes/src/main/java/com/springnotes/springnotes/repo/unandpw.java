package com.springnotes.springnotes.repo;

import com.springnotes.springnotes.models.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface unandpw extends JpaRepository<login,String> {

    @Query(value = "select password from login where username = :un",nativeQuery = true)
    String valid(@Param("un")String un);
}
