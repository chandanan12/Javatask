class Painter extends Artist {
    @Override
    public void draw() {
        System.out.println("Drawing a landscape with brush strokes...");
    }

    @Override
    public void color() {
        System.out.println("Coloring with oil paints and textures...");
    }
}