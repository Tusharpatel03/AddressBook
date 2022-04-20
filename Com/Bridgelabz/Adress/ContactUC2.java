package Com.Bridgelabz.Adress;


public class ContactUC2 {                                             
	private String firstName;    
	private String LastName;
    private String MobileNo;
    private String City;
    private String State;
    private String Pincode;
    private String Email;
    
    public void Contact ()
    {
        this.firstName = firstName;
        this.LastName = LastName;
        this.City = City;
        this.State = State;
        this.Pincode = Pincode;
        this.MobileNo = MobileNo;
        this.Email = Email;
    }
    	
   
    
    public String getfirstName() {
    return firstName;
   }

   public void setifirstName(String firstName) {
    this.firstName = firstName;
   }

   public String getlastName() {
    return LastName;
   }

   public void setilastName(String lastName) {
   this.LastName = lastName;
  }
   
   public String getCity() {
   return City;
  }

  public void setCity(String city) {
  this.City = city;
  }

  public String getState() {
  return State;
  }

  public void setState(String state) {
  this.State = state;
  }

  public String getPinCode() {
  return Pincode;
}

public void setPinCode(String pinCode) {
    this.Pincode = Pincode;
}

public String getMobileNo() {
    return MobileNo;
}

public void setMobileNo(String mobileNo) {
    this.MobileNo = MobileNo;
}

public String getEmail() {
    return Email;
}

public void setEmail(String email) {
    this.Email = email;
}

@Override
public String toString() {
    return "Contact Details {"+" FirstName : " + firstName + '\''  +" ,  LastName : " + LastName +'\''+", City : " + City + '\'' + " + State : " + State + '\''+" + Mobile No : " + MobileNo + '\'' +" + Pin-Code : " + Pincode +
            '\'' +" + Email : " + Email + '\'' +'}' ;
}

}
   


