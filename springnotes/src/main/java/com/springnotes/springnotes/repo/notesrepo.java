package com.springnotes.springnotes.repo;

import com.springnotes.springnotes.models.allnotes;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface notesrepo extends JpaRepository<allnotes,String> {

    @Query(value = "select concat(notes,' ',date) from allnotes where username= :un order by date",nativeQuery = true)
    List<String> getuserdata(@Param("un") String un);


}
