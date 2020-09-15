package com.kevcode.awsimageupload.datastore;

import com.kevcode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("ed9175ca-17b7-4d57-8a6d-54c7566ead8a"), "aaronrodgers", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("7374b220-eb82-4b55-ab77-38de074003d1"), "derrickrose", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
