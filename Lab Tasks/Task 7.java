class Distance {
    int feet;
    int inches;

    
    Distance() {
        feet = 0;
        inches = 0;
    }

    
    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 8);

        d1.display();
        d2.display();
    }
}
