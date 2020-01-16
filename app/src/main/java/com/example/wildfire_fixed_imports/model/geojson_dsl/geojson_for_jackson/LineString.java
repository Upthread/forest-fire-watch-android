package com.example.wildfire_fixed_imports.model.geojson_dsl.geojson_for_jackson;

public class LineString extends MultiPoint {

	public LineString() {
	}

	public LineString(LngLatAlt... points) {
		super(points);
	}

	@Override
	public <T> T accept(GeoJsonObjectVisitor<T> geoJsonObjectVisitor) {
		return geoJsonObjectVisitor.visit(this);
	}

	@Override
	public String toString() {
		return "LineString{} " + super.toString();
	}
}
