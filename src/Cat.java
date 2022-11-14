public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public boolean eat(String foodType){
        return true;
    }

    @Override
    public void showMood(Boolean mood) {
        if (mood = true) {
            System.out.println("danser tango");
        } else {
            System.out.println("hvæser");
        }
    }

}
