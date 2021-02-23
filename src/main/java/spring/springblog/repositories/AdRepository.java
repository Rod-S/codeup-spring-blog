package spring.springblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.springblog.models.Ad;

import java.util.List;

public interface AdRepository extends JpaRepository<Ad, Long> {

//    Ad findByTitle(String title);
//
//    List<Ad> findByOrderByTitle();
//
//    @Query("from Ad a where a.id like ?1 and ?2")
//    Ad getAdById(long id);

    //THESE TWO ARE THE SAME QUERY

//    @Query("select title from Ad where LENGTH(title) < 15")
//    List<String> getAdsOfCertainTitleLength();
//
//    @Query(nativeQuery = true, value = "SELECT title FROM ads WHERE LENGTH(title) < 10")
//    List<String> getAdsNativeQuery();
}
