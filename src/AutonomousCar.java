public class AutonomousCar {

    public static void main(String[] args) {
        String signal = "красный"; // тут изменить цвет для проверки других условий

        switch(signal) {
            case "красный":
                System.out.println("Остановиться");
                break;
            case "зеленый":
                System.out.println("Ехать");
                break;
            case "желтый":
                System.out.println("Подождать");
                break;
            default:
                System.out.println("Некорректный сигнал светофора");
        }
    }
}