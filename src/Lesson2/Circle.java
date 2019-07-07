package Lesson2;

public class Circle {
    public static void main(String[] args) {
        //1. площадь круга и периметр по заданному радиусу
        int radius = 10;
        double circleArea = Math.PI * Math.pow(radius, 2);
        double perimeter = Math.PI * 2 * radius;
        System.out.println("Площадь круга радиусом " + radius + " равна " + circleArea);
        System.out.println("Периметр круга радиусом " + radius + " равен " + perimeter);
        System.out.println(System.lineSeparator());

        //2. Расчет радиуса из площади
        int givenCircleArea = 20;
        double calcRadius = Math.sqrt(givenCircleArea / Math.PI);
        System.out.println("Радиус круга площадью " + givenCircleArea + " равен " + calcRadius);
        System.out.println(System.lineSeparator());

        //3. Расчет площади сектора из радиуса и угла в градусах
        int sectorRadius = 30;
        int sectorDegree = 60;
        double sectorArea = Math.PI * Math.pow(sectorRadius, 2) * sectorDegree / 360;
        System.out.println("Площадь сектора радиусом " + sectorRadius + " и углом " + sectorDegree + "° равна " + sectorArea);
        System.out.println(System.lineSeparator());
    }
}
