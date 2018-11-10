package com.jen.satellite.track;

public interface SatelliteAntennaTackControl {
	/**
	 * Get the current direction the antenna is facing in degrees (0-360)
	 * @return
	 */
	public double getDirection();
	
	/**
	 * Get the current angle the antenna is elevated to in degrees off of straight up (-90 - 90)
	 * @return
	 */
	public double getElevation();
	
	/**
	 * Get the current arc the antenna is at in degrees (0-180)
	 * When tracking a satellite this will be what changes over time with the direction and elevation setup to allow a proper track of the satellite.
	 * @return
	 */
	public double getArc();
	
	/**
	 * Set the current direction the antenna is facing in degrees (0-360)
	 * @return
	 */
	public void setDirection(double direction);
	/**
	 * Set the current angle the antenna is elevated to in degrees off of straight up (-90 - 90)
	 * @return
	 */
	public double setElevation(double elevation);
	/**
	 * Set the current arc the antenna is at in degrees (0-180)
	 * When tracking a satellite this will be what changes over time with the direction and elevation setup to allow a proper track of the satellite.
	 * @return
	 */
	public double setArc(double arc);
	
}
