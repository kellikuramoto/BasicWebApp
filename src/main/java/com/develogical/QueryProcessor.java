package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "MyTeam";
        }

        if (query.contains("Big Hero")) {
            return "With all the heart and humor audiences expect from Walt Disney Animation Studios" + 
            "“Big Hero 6” is an action-packed comedy adventure that introduces Baymax, a lovable, personal companion robot, who forms a special bond with robotics prodigy Hiro Hamada.";
        }

        return "";
    }
}
