package me.goodnesskayode.curis;


public class Request {

    private String requestName;
    private String requestDate;
    private String requestStatus;

    public Request(){}
    public Request(String requestName,String requestDate, String requestStatus){
        this.requestName= requestName;
        this.requestDate= requestDate;
        this.requestStatus= requestStatus;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getRequestStatus() {
        return requestStatus;
    }
}
