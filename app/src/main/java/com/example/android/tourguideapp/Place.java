package com.example.android.tourguideapp;

public class Place {
    private String placeNameId;

    private String placeDescriptionId;

    private String placeAddressId;

    private int placeWebLink;

    private String placePhoneId;

    private int placeImageLink;


    public Place(String placeNameId, String placeDescriptionId, String placeAddressId, int placeWebLink, String placePhoneId,
                 int placeImageLink){

       placeNameId = placeNameId;
       placeDescriptionId = placeDescriptionId;
       placeAddressId = placeAddressId;
       placeWebLink = placeWebLink;
       placePhoneId = placePhoneId;
       placeImageLink = placeImageLink;

    }

    public Place(String jw_marriot, String nicel_hotel, String s, String s1, String s2) {

    }

    public String getPlaceNameId() {
        return placeNameId;
    }

    public String getPlaceDescriptionId() {
        return placeDescriptionId;
    }

    public boolean hasImage() {
        return false;
    }

    public int getPlaceImageId() {
        return placeImageLink;
    }

    public String getPlaceAddressId() {
        return placeAddressId;
    }

    public String getPlacePhoneId() {
        return placePhoneId;
    }

    public int getPlaceWebId() {
        return placeWebLink;
    }
}
