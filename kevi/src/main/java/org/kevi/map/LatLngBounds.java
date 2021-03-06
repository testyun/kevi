package org.kevi.map;

public class LatLngBounds {
	LatLng start;
	LatLng end;
	public LatLngBounds(LatLng start, LatLng end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	public void setBounds(LatLng start, LatLng end) {
		this.start = start;
		this.end = end;
	}

	public LatLng getStart() {
		return start;
	}

	public void setStart(LatLng start) {
		this.start = start;
	}

	public LatLng getEnd() {
		return end;
	}

	public void setEnd(LatLng end) {
		this.end = end;
	}
	
	public int getStartX(int zoom) {
		return (int)(MapUtil.lngToPixel(start.lng, zoom)/MapUtil.TILES_SIZE)-1;
	}
	public int getStartY(int zoom) {
		return (int)(MapUtil.latToPixel(start.lat, zoom)/MapUtil.TILES_SIZE)-1;
	}
	public int getEndX(int zoom) {
		return (int)(MapUtil.lngToPixel(end.lng, zoom)/MapUtil.TILES_SIZE)+1;
	}
	public int getEndY(int zoom) {
		return (int)(MapUtil.latToPixel(end.lat, zoom)/MapUtil.TILES_SIZE)+1;
	}
	public Point getStartPixel(int zoom) {
		return MapUtil.ll2p(start, zoom);
	}
	public Point getEndPixel(int zoom) {
		return MapUtil.ll2p(end, zoom);
	}
}
