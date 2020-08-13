public class Random {

        public static void main(String[] args) {

            String [] cities = {"Chicago", "NYC", "Vienna", "Toronto","Los Angeles","Miami", "Ottawa",
                    "Istanbul","Moscow","Kiev","London","Paris","Amsterdam","Tokyo","Sydney"};
            double random = (Math.random() * cities.length);
            int randomNumber = (int) random;
            String randomCity = cities[randomNumber];
            System.out.println(randomCity);

        }

    }

