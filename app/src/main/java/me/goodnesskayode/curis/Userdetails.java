package me.goodnesskayode.curis;

public class Userdetails {

    public String uid;
    public String name;
    public String email;
    public String mobileNumber;
    public String hospital;
    public String hospitalAddress;
    public String nextOfKin;
    public String nextOfKinMobileNumber;
    public String workAddress;
    public int status;

    public Userdetails(){}

    public Userdetails(String uid,String name, String email, String mobileNumber,
                       String hospital,String hospitalAddress,
                       String nextOfKin,String nextOfKinMobileNumber,String workAddress,int status){
        this.uid=uid;
        this.name=name;
        this.email=email;
        this.mobileNumber= mobileNumber;
        this.status=status;
        this.hospital= hospital;
        this.hospitalAddress =hospitalAddress;
        this.nextOfKin =nextOfKin;
        this.nextOfKinMobileNumber =nextOfKinMobileNumber;
        this.workAddress =workAddress;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber=mobileNumber;
    }

    public String getMobileNumber()
    {
        return mobileNumber;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKinMobileNumber(String nextOfKinMobileNumber) {
        this.nextOfKinMobileNumber = nextOfKinMobileNumber;
    }

    public String getNextOfKinMobileNumber() {
        return nextOfKinMobileNumber;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }
}