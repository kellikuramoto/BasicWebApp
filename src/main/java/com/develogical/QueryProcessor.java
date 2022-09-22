package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "KelliLea";
        }

        if (query.toLowerCase().contains("largest")) {
            String[] response = query.split(":");
            String num = response[1];

            String[] nums = num.split(",");
            System.out.println(nums);

            int max = 0;

            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i].trim();
                int number = Integer.parseInt(nums[i]);
                if (number > max) {
                    max = number;
                }
                System.out.print(max);
            }
            String maxString = String.valueOf(max);
            return maxString;
        }

        if (query.toLowerCase().contains("plus")) {
            String[] response = query.split("is");
            String numbers = response[1];

            String[] nums = numbers.split("plus");
            String firstNum = nums[0].trim();
            String secondNum = nums[1].trim();

            int first = Integer.parseInt(firstNum);
            int second = Integer.parseInt(secondNum);
            
            int sum = first + second;

            return String.valueOf(sum);
        }

        if (query.contains("Big Hero")) {
            return "With all the heart and humor audiences expect from Walt Disney Animation Studios" + 
            "“Big Hero 6” is an action-packed comedy adventure that introduces Baymax, a lovable, personal companion robot, who forms a special bond with robotics prodigy Hiro Hamada.";
        }

        return "";
    }
}
