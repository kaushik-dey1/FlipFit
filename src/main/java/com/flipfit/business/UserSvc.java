package com.flipfit.business;

import com.flipfit.bean.Bookings;
import com.flipfit.bean.Gym;
import com.flipfit.bean.User;

import java.util.List;

public interface UserSvc {
    boolean cancelSlot(int bookingId);
    List<Bookings> viewAllBookings(int userId);
    List<Gym> viewAllGymsWithSlots();
    List<Gym> viewAllGymsByArea(String area);
    boolean validateUser(String email, String password);
    boolean createUser(User user);
    boolean updateUserDetails(User user);
    int getUserIdByEmail(String email);
    int getSeatCount(int gymId, int startTime);
}
