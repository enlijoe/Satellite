package com.jen.satellite.track;

import com.jen.satellite.common.TimeSpan;

public interface GroundStation {
	public void startTracking(GroundStation groundStation, SatelliteOrbit satelliteOrbit);
	public void stopTracking();
	public void setSatelliteAntenna(SatelliteAntennaTackControl satelliteAntenna);
	public boolean isTrackingActive();
	public TimeSpan getNextSatelliteOrbitalEvent(GroundStation groundStation, SatelliteOrbit satelliteOrbit);
	public void notifyTackingEvent(SatelliteTrackingEventListener listener);
	public void removeNotifyTackingEvent(SatelliteTrackingEventListener listener);
	public SatelliteTrackingEvent getLastSatelliteTrackingEvent();
}
