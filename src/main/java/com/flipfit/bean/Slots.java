package com.flipfit.bean;

/**
 * details to identify unique slots for a particular gym
 */

public class Slots {
  private int slotId;
  private int centreId;
  private int slotTime;
  private int seatsAvailable;
  private int maxCapacity;

  public int getSlotId() {
    return slotId;
  }

  public void setSlotId(int slotId) {
    this.slotId = slotId;
  }

  public int getCentreId() {
    return centreId;
  }

  public void setCentreId(int centerId) {
    this.centreId = centerId;
  }

  public int getSlotTime() {
    return slotTime;
  }

  public void setSlotTime(int slotTime) {
    this.slotTime = slotTime;
  }

  public int getSeatsAvailable() {
    return seatsAvailable;
  }

  public void setSeatsAvailable(int seatsAvailable) {
    this.seatsAvailable = seatsAvailable;
  }

  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }
}
