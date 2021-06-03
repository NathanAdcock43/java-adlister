package com.codeup.adlister.dao;


public class DaoFactory {
    private static Users usersDao;
    private static Ads adsDao;

    public static Users getUsersDao() {
        Config config = new Config();
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

    public static Ads getAdsDao() {
        Config config = new Config();
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
