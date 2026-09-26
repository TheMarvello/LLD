package CarRentalSystem;

public class User {
    int UserId;
    String UserName;
    String dlNumber;

    User(int UserId, String UserName, String dlNumber){
        this.UserId = UserId;
        this.UserName = UserName;
        this.dlNumber = dlNumber;
    }

    String getUserName(){
        return this.UserName;
    }

    String getDlNumber(){
        return this.dlNumber;
    }

    String getUserId(){
        return String.valueOf(this.UserId);
    }
}
