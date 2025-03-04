package id.ac.polinema.intent.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;

public class user implements Parcelable {
    private String username;
    private String name;
    private int age;

    public user(String username, String name, int age) {
        this.username = username;
        this.name = name;
        this.age = age;
    }

    public user() {

    }

    protected user(Parcel in) {
        username = in.readString();
        name = in.readString();
        age = in.readInt();
    }

    public static final Creator<user> CREATOR = new Creator<user>() {
        @Override
        public user createFromParcel(Parcel in) {
            return new user(in);
        }

        @Override
        public user[] newArray(int size) {
            return new user[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(username);
        parcel.writeString(name);
        parcel.writeInt(age);
    }
}

