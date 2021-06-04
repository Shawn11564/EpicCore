package dev.mrshawn.epiccore.utils.math;

public class ScaleUtils {

	public static int linearConvert(int currentValue, int originalMin, int originalMax, int newMin, int newMax) {
		return (((currentValue - originalMin) * (newMax - newMin)) / (originalMax - originalMin)) + newMin;
	}

	public static int linearConvert(int currentValue, int originalMin, int originalMax) {
		return linearConvert(currentValue, originalMin, originalMax, 0, 100);
	}

}
