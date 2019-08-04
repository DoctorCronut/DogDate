package com.example.dogdate;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

    private String mPetName;
    private String mOwnerName;
    private int mPetAge;
    private List<Contacts> mPets;
    private boolean mPetView;

    public Contacts(String petName, String ownerName, int petAge, ArrayList<Contacts> pets,
                    boolean petView){
        mPetName = petName;
        mOwnerName = ownerName;
        mPetAge = petAge;
        mPets = pets;
        mPetView = petView;
    }

    public String getmPetName() {
        return mPetName;
    }

    public String getmOwnerName() {
        return mOwnerName;
    }

    public int getmPetAge() {
        return mPetAge;
    }


}
