package com.jen.satellite.track;

public interface SatelliteTrackingEvent {
	public boolean isTackingActive();
	public long getEventTime();
	public GroundLocation getStationGroundLocation();
	public SatelliteOrbit getSatelliteOrbit();
}
