class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks loudly...");
    }

    @Override
    public void play() {
        System.out.println("Dog loves to play fetch...");
    }
}