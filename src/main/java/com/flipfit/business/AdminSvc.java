package com.flipfit.business;

import com.flipfit.bean.Gym;
import com.flipfit.bean.GymOwner;
import com.flipfit.bean.User;

import java.util.List;

public interface AdminSvc {
    List<GymOwner> viewGymOwners();
    List<Gym> viewGyms();
    List<User> viewUsers();
    boolean verifyGym(int gymId);
    boolean verifyGymOwner(int gymOwnerId);
    List<Gym> getUnverifiedGyms();
}
