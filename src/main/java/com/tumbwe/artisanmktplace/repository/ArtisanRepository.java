package com.tumbwe.artisanmktplace.repository;

import com.tumbwe.artisanmktplace.entity.Artisan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtisanRepository extends JpaRepository<Artisan, Long> {
}
