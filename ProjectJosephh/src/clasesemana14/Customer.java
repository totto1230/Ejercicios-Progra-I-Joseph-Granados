package clasesemana14;

import java.util.Date;

public class Customer extends Usuario {
    
    private String customerName;
    private String address;
    private String email;
    private String creditCardInfo;
    private String shippingInfo;
    private float accountBalance;
    
    
    public void register(){}
    public void login(){}
    public void updateProfile(){}

    public Customer(String customerName, String address, String email, String creditCardInfo, String shippingInfo, float accountBalance) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.creditCardInfo = creditCardInfo;
        this.shippingInfo = shippingInfo;
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public void setShippingInfo(String shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    

}
