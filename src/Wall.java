public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        checkWidth(width);
        checkHeight(height);
    }

    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void checkWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width=width;
        }
    }

    public void checkHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height=height;
        }
    }

    public double getArea(){
        return this.width*this.height;
    }

}
