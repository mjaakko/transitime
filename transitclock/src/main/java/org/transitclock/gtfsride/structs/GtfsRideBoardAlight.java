package org.transitclock.gtfsride.structs;

import org.apache.commons.csv.CSVRecord;
import org.transitclock.utils.csv.CsvBase;

public class GtfsRideBoardAlight extends CsvBase {
	String tripId;	
	String stopId;
	Integer stopSequence;
	String recordUse;
	Integer scheduleRelationship;
	Integer boardings;
	Integer alightings;
	Integer currentLoad;
	Integer loadCount;
	Integer loadType;
	Boolean rackDown;
	Integer bikeBoardings;
	Integer bikeAlightings;
	Boolean rampUsed;
	Integer rampBoardings;
	Integer rampAlightings;
	String serviceDate;
	String serviceArrivalTime;
	String serviceDepartureTime;
	Integer source;
	
	public GtfsRideBoardAlight(CSVRecord record, boolean supplementalFile, String fileName) {
		super(record, supplementalFile, fileName);
		this.tripId=this.getRequiredValue(record, "trip_id");
		this.stopId=this.getRequiredValue(record, "stop_id");
		this.stopSequence=Integer.parseInt(this.getRequiredValue(record, "stop_sequence"));
		this.recordUse=this.getRequiredValue(record, "record_use");		
		this.scheduleRelationship=this.getOptionalIntegerValue(record, "schedule_relationship");
		this.boardings=this.getOptionalIntegerValue(record, "boardings");
		this.alightings=this.getOptionalIntegerValue(record, "alightings");
		this.currentLoad=this.getOptionalIntegerValue(record, "current_load");
		this.loadCount=this.getOptionalIntegerValue(record, "load_count");
		this.loadType=this.getOptionalIntegerValue(record, "load_type");
		this.rackDown=this.getOptionalBooleanValue(record, "ramp_down");				
		this.bikeBoardings=this.getOptionalIntegerValue(record, "bike_boardings");
		this.bikeAlightings=this.getOptionalIntegerValue(record, "bike_alightings");
		this.rampUsed=this.getOptionalBooleanValue(record, "ramp_used");
		this.rampBoardings=this.getOptionalIntegerValue(record, "ramp_boardings");
		this.rampAlightings=this.getOptionalIntegerValue(record, "ramp_alightings");
		this.serviceDate=this.getOptionalValue(record, "service_date");
		this.serviceArrivalTime=this.getOptionalValue(record, "service_arrival_time");
		this.serviceDepartureTime=this.getOptionalValue(record, "service_departure_time");
		this.source=this.getOptionalIntegerValue(record, "source");
	}

	public String getTripId() {
		return tripId;
	}

	public String getStopId() {
		return stopId;
	}

	public Integer getStopSequence() {
		return stopSequence;
	}

	public String getRecordUse() {
		return recordUse;
	}

	public Integer getScheduleRelationship() {
		return scheduleRelationship;
	}

	public Integer getBoardings() {
		return boardings;
	}

	public Integer getAlightings() {
		return alightings;
	}

	public Integer getCurrentLoad() {
		return currentLoad;
	}

	public Integer getLoadCount() {
		return loadCount;
	}

	public Integer getLoadType() {
		return loadType;
	}

	public Boolean getRackDown() {
		return rackDown;
	}

	public Integer getBikeBoardings() {
		return bikeBoardings;
	}

	public Integer getBikeAlightings() {
		return bikeAlightings;
	}

	public Boolean getRampUsed() {
		return rampUsed;
	}

	public Integer getRampBoardings() {
		return rampBoardings;
	}

	public Integer getRampAlightings() {
		return rampAlightings;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public String getServiceArrivalTime() {
		return serviceArrivalTime;
	}

	public String getServiceDepartureTime() {
		return serviceDepartureTime;
	}

	public Integer getSource() {
		return source;
	}

	@Override
	public String toString() {
		return "GtfsRideBoardAlight [tripId=" + tripId + ", stopId=" + stopId + ", stopSequence=" + stopSequence
				+ ", recordUse=" + recordUse + ", scheduleRelationship=" + scheduleRelationship + ", boardings="
				+ boardings + ", alightings=" + alightings + ", currentLoad=" + currentLoad + ", loadCount=" + loadCount
				+ ", loadType=" + loadType + ", rackDown=" + rackDown + ", bikeBoardings=" + bikeBoardings
				+ ", bikeAlightings=" + bikeAlightings + ", rampUsed=" + rampUsed + ", rampBoardings=" + rampBoardings
				+ ", rampAlightings=" + rampAlightings + ", serviceDate=" + serviceDate + ", serviceArrivalTime="
				+ serviceArrivalTime + ", serviceDepartureTime=" + serviceDepartureTime + ", source=" + source + "]";
	}
	
}