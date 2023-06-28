package com.tumbwe.artisanmktplace.service;

import com.tumbwe.artisanmktplace.entity.Artisan;
import com.tumbwe.artisanmktplace.repository.ArtisanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class ArtisanServiceImpl implements ArtisanService{
    private final ArtisanRepository artisanRepository;

    public ArtisanServiceImpl(ArtisanRepository artisanRepository){
        this.artisanRepository = artisanRepository;
    }
    @Override
    public void createArtisan(Artisan artisan) {
        artisanRepository.save(artisan);
    }

    @Override
    public List<Artisan> getArtisans() {
        return artisanRepository.findAll();
    }

    @Override
    public Optional<Artisan> getArtisan(Long id) {
        return artisanRepository.findById(id);
    }

    @Override
    public void updateArtisan(Long id, Artisan artisan) {
        Optional<Artisan> existingArtisan = artisanRepository.findById(id);
        if (existingArtisan.isPresent()) {
            Artisan updatedArtisan = existingArtisan.get();
            if (artisan.getName() != null) {
                updatedArtisan.setName(artisan.getName());
            }
            if (artisan.getEmail() != null) {
                updatedArtisan.setEmail(artisan.getEmail());
            }
            if (artisan.getPassword() != null) {
                updatedArtisan.setPassword(artisan.getPassword());
            }
            if (artisan.getPhone() != null) {
                updatedArtisan.setPhone(artisan.getPhone());
            }
            if (artisan.getLocation() != null) {
                updatedArtisan.setLocation(artisan.getLocation());
            }
            if (artisan.getBio() != null) {
                updatedArtisan.setBio(artisan.getBio());
            }
            if (artisan.getProfileUrl() != null) {
                updatedArtisan.setProfileUrl(artisan.getProfileUrl());
            }

            artisanRepository.save(updatedArtisan);
        } else {
            throw new RuntimeException("Artisan not found");
        }
    }
}


