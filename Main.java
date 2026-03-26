import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter current city: ");
        String currentCity = sc.nextLine();

        System.out.print("Enter destination city: ");
        String destinationCity = sc.nextLine();

        // Getting weather data
        String currentWeather = WeatherService.getWeather(currentCity);
        String destWeather = WeatherService.getWeather(destinationCity);

        // Display weather
        System.out.println("\n--- Current Weather ---");
        System.out.println(currentWeather);

        System.out.println("\n--- Destination Weather ---");
        System.out.println(destWeather);

        // Generate suggestion based on dummy values
        String condition = "clear";   // you can change to rain/storm
        double temperature = 30;

        TravelAdvisor.suggest(condition, temperature);

        sc.close();
    }
}

// Weather Service Class
class WeatherService {

    public static String getWeather(String city) {

        // Dummy weather data (no API, so no errors)
        String data = "City: " + city + "\nTemperature: 30°C\nCondition: Clear";

        return data;
    }
}

// Travel Advisor Class
class TravelAdvisor {

    public static void suggest(String condition, double temp) {

        System.out.println("\n--- Travel Suggestion ---");

        if (condition.equalsIgnoreCase("rain")) {
            System.out.println("Carry an umbrella ☔");
        } 
        else if (temp > 35) {
            System.out.println("Avoid traveling in afternoon ☀️");
        } 
        else if (condition.equalsIgnoreCase("storm")) {
            System.out.println("Travel not recommended ⚠️");
        } 
        else {
            System.out.println("Weather is good for travel 😊");
        }
    }
}