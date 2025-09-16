class ACProduct {
    public static void main(String[] args) {
        byte b = 9;
        short s = 90;
        int i = 9;
        long l = 900L;
        float f = 9.5f;
        double d = 18.5;
        char c = 'A';
        boolean flag = true;
        String str = "AirConditioner";

        int count = 1;
        while(count <= 5) {
            System.out.println("AC Iteration " + count);
            System.out.println("Byte: " + b);
            System.out.println("Short: " + s);
            System.out.println("Int: " + i);
            System.out.println("Long: " + l);
            System.out.println("Float: " + f);
            System.out.println("Double: " + d);
            System.out.println("Char: " + c);
            System.out.println("Boolean: " + flag);
            System.out.println("String(Product): " + str);
            System.out.println("----------------------");

            b+=6; s+=9; i+=9; l+=90;
            f+=4.5f; d+=9.0;
            c++; flag = !flag;
            str = str + "&";
            count++;
        }
    }
}