package se.kth.webservice.second.models;

/**
 * Created by victoraxelsson on 2017-02-06.
 */
public class Departure {
    int portSourceId;
    int destinationPortId;
    String lifts;
    String lands;

    public int getPortSourceId() {
        return portSourceId;
    }

    public void setPortSourceId(int portSourceId) {
        this.portSourceId = portSourceId;
    }

    public int getDestinationPortId() {
        return destinationPortId;
    }

    public void setDestinationPortId(int destinationPortId) {
        this.destinationPortId = destinationPortId;
    }

    public String getLifts() {
        return lifts;
    }

    public void setLifts(String lifts) {
        this.lifts = lifts;
    }

    public String getLands() {
        return lands;
    }

    public void setLands(String lands) {
        this.lands = lands;
    }
}
