package com.jen.satellite.common;

public interface TimeSpan extends Comparable<TimeSpan> {
	/**
	 * Get the starting time of the time span
	 * @return
	 */
	public long getStartTime();
	/**
	 * Get the ending time of the time span
	 * @return
	 */
	public long getEndTime();
	
	/**
	 * Returns true of this time span overlaps the given time span otherwise false.
	 * @param timeSpan
	 * @return
	 */
	public boolean overlaps(TimeSpan timeSpan);
}
