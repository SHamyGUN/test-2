public class TrafficLight {
    String color;

    public TrafficLight(String color) {
        this.color = color;
    }

    public void action() {
        switch (color) {
            case "red":
                System.out.println("остановиться");
                break;
            case "green":
                System.out.println("ехать");
                break;
            case "yellow":
                System.out.println("подождать");
                break;
            default:
                System.out.println("Некорректный цвет светофора");
                break;
        }
    }

    public static void main(String[] args) {
        TrafficLight redLight = new TrafficLight("red");
        TrafficLight greenLight = new TrafficLight("green");
        TrafficLight yellowLight = new TrafficLight("yellow");

        redLight.action();    // Вывод: остановиться
        greenLight.action();  // Вывод: ехать
        yellowLight.action(); // Вывод: подождать
    }
}