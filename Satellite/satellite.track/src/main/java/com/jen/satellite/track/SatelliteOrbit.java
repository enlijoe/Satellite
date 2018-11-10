package com.jen.satellite.track;

public interface SatelliteOrbit {
	/**
	 * Get the shape of the ellipse, describing how much it is elongated compared to a circle.
	 * @return
	 */
	public double getEccentricity();
	
	/**
	 * Get the sum of the periapsis and apoapsis distances divided by two. For circular orbits, the semimajor axis is the distance between the centers of the bodies, not the distance of the bodies from the center of mass.
	 * @return
	 */
	public double getSemimajorAxis();
	
	/**
	 * Get the vertical tilt of the ellipse with respect to the reference plane, measured at the ascending node (where the orbit passes upward through the reference plane, the green angle i in the diagram). Tilt angle is measured perpendicular to line of intersection between orbital plane and reference plane. Any three points on an ellipse will define the ellipse orbital plane. The plane and the ellipse are both two-dimensional objects defined in three-dimensional space.
	 * @return
	 */
	public double getInclination();
	
	/**
	 * Get the horizontally orients the ascending node of the ellipse with respect to the reference frame's vernal point. This is measured in the reference plane.
	 * @return
	 */
	public double getLongitudeOfAscendingNode();
	
	/**
	 * Get the orientation of the ellipse in the orbital plane, as an angle measured from the ascending node to the periapsis.
	 * @return
	 */
	public double getArgumentOfPeriapsis();
	/**
	 *  Get the position of the orbiting body along the ellipse at a specific time (the epoch)
	 * @return
	 */
	public double getTrueAnomaly();
	
}
