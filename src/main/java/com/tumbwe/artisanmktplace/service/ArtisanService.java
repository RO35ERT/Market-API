package com.tumbwe.artisanmktplace.service;

import com.tumbwe.artisanmktplace.entity.Artisan;

import java.util.List;
import java.util.Optional;

public interface ArtisanService {
    public void createArtisan(Artisan artisan);

    List<Artisan> getArtisans();

    Optional<Artisan> getArtisan(Long id);

    void updateArtisan(Long id, Artisan artisan);
}
