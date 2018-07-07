package com.example.android.tourguideapp;

public class Place {
    private int image;
    private String placeNameId;
    private String pDescriptionId;
    private String p_placeAddressId;
    private String p_placeWebId;
    private String p_placePhoneId;
    private int placeImageId;

    public Place(int image, String name1, String description1, String address1, String web1, String phone1) {

        placeNameId = name1;
        pDescriptionId = description1;
        p_placeAddressId = address1;
        p_placeWebId = web1;
        p_placePhoneId = phone1;
        placeImageId = image;

    }


    public String getPlaceNameId() {
        return placeNameId;
    }

    public String getPlaceDescriptionId() {
        return pDescriptionId;
    }

    public String getPlaceAddressId() {
        return p_placeAddressId;
    }

    public String getPlaceWebId() {
        return p_placeWebId;
    }

    public String getPlacePhoneId() {
        return p_placePhoneId;
    }

    public int getPlaceImageId() {
        return placeImageId;
    }
}

