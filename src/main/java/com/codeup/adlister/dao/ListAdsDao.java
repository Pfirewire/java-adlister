package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        // we'll assign an "id" here based on the size of the ads list
        // really the dao would handle this
        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    public Ad findById(String id) {
        if (ads == null) {
            ads = generateAds();
        }
        for(Ad ad : ads) {
            if(id.equals(String.valueOf(ad.getId()))) {
                return ad;
            }
        }
        return null;
    }

    @Override
    public List<Ad> searchAds(String search) {
        if (ads == null) {
            ads = generateAds();
        }
        List<Ad> containsSearch = new ArrayList<>();
        for(Ad ad : ads) {
            if(ad.getTitle().contains(search) || ad.getDescription().contains(search)) {
                containsSearch.add(ad);
            }
        }
        return containsSearch;
    }

    @Override
    public List<Ad> adsByUser(Long id) {
        if (ads == null) {
            ads = generateAds();
        }
        List<Ad> adsByUser = new ArrayList<>();
        for(Ad ad : ads) {
            if(ad.getUserId() == id) {
                adsByUser.add(ad);
            }
        }
        return adsByUser;
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
            1,
            1,
            "playstation for sale",
            "This is a slightly used playstation"
        ));
        ads.add(new Ad(
            2,
            1,
            "Super Nintendo",
            "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
            3,
            2,
            "Junior Java Developer Position",
            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
            4,
            2,
            "JavaScript Developer needed",
            "Must have strong Java skills"
        ));
        return ads;
    }
}
