public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

//        switch (animal){
//            case CAT:
//                System.out.println("It's a cat!");
//                break;
//            case DOG:
//                System.out.println("It's a dog!");
//                break;
//        }

        Season season = Season.SUMMER;

        switch (season){
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside!");
                break;
        }
    }
}
