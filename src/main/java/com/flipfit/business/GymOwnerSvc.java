package com.flipfit.business;

import com.flipfit.bean.Gym;
import com.flipfit.bean.GymOwner;

import java.util.List;

public interface GymOwnerSvc {
    boolean addGym(Gym gym);
    List<Gym> viewMyGyms(int gymOwnerId);
    boolean createGymOwner(GymOwner gymOwner);
    boolean validateGymOwner(String email, String password);
    boolean updateGymOwner(String email, String password, String updatedPassword);
    boolean updateGymOwner(GymOwner gymOwner);
    int getGymOwnerIdByEmail(String email);
    boolean updateSeatCount(int gymId, int startTime, int seatCount);
    boolean updateGymDetails(Gym gym);
}
