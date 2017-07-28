package me.goodnesskayode.curis.models;


public class Request {

    private String requestCreatorName;
    private String requestCreatorAddress;
    private String requestCreatorDestination;
    private String requestCreatorUid;
    private String numberOfPatients;
    private int status;

    public Request(){}

    public Request(String requestCreatorName,String requestCreatorAddress, String requestCreatorDestination,
                   String requestCreatorUid, String numberOfPatients, int status)
    {
        this.requestCreatorName=requestCreatorName;
        this.requestCreatorAddress=requestCreatorAddress;
        this.requestCreatorDestination=requestCreatorDestination;
        this.requestCreatorUid=requestCreatorUid;
        this.status=status;
    }

    public void setRequestCreatorName(String requestCreatorName) {
        this.requestCreatorName = requestCreatorName;
    }

    public String getRequestCreatorName() {
        return requestCreatorName;
    }

    public String getRequestCreatorAddress() {
        return requestCreatorAddress;
    }

    public void setRequestCreatorAddress(String requestCreatorAddress) {
        this.requestCreatorAddress = requestCreatorAddress;
    }

    public void setRequestCreatorDestination(String requestCreatorDestination) {
        this.requestCreatorDestination = requestCreatorDestination;
    }

    public String getRequestCreatorDestination() {
        return requestCreatorDestination;
    }

    public void setRequestCreatorUid(String requestCreatorUid) {
        this.requestCreatorUid = requestCreatorUid;
    }

    public String getRequestCreatorUid() {
        return requestCreatorUid;
    }

    public void setNumberOfPatients(String numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public String getNumberOfPatients() {
        return numberOfPatients;
    }

}
