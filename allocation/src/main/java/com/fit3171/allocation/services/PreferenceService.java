package com.fit3171.allocation.services;

import com.fit3171.allocation.models.Preference;
import com.fit3171.allocation.repositories.PreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferenceService {
    private PreferenceRepository preferenceRepository;

    @Autowired
    public void setPreferenceRepository(PreferenceRepository preferenceRepository) {
        this.preferenceRepository = preferenceRepository;
    }

    public Iterable<Preference> findAll() {
        return preferenceRepository.findAll();
    }
}
