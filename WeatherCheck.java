public class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 100;
        boolean currentlyRaining = true;
        if ( temperature >= 100 && currentlyRaining) {
            System.out.println("It is very hot and wet : wear shorts and an umbrella hat");}
        else if(temperature < 100 && currentlyRaining) {
            System.out.println("It is cold and raining : wear trousers and an umbrella hat");
        }
        else if(temperature >= 100 && !(currentlyRaining)) {
            System.out.println("It is hot and not raining: enjoy the day in minimal clothing ");
        }
        else if(temperature > 100 && !(currentlyRaining)) {
            System.out.println("It is cold and not raining : wear scarf");
        }

}
}
