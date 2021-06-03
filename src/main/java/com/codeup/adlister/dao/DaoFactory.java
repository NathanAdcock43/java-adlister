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


//java.lang.RuntimeException: Error creating a new ad.
//	com.codeup.adlister.dao.MySQLAdsDao.insert(MySQLAdsDao.java:54)
//	com.codeup.adlister.controllers.CreateAdServlet.doPost(CreateAdServlet.java:26)
//	javax.servlet.http.HttpServlet.service(HttpServlet.java:652)
//	javax.servlet.http.HttpServlet.service(HttpServlet.java:733)
//	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)