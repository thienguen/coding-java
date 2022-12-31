package this_super;

class shape {
    private int x;
    private int y;

    public shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends shape 
{
    private int width;
    private int height;

    public Rectangle(int x, int y) {
        this(x, y, 0, 0);
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
