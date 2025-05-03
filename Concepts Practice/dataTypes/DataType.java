public class DataType{

    byte bytVal = 127; //Range -128 to 127 , Size - 8bits or 1byte

    short shrtVal = 3276; //Range -32768 to 32767, Size - 2bytes

    int intVal = 458; // Upto 9 digits, Size - 4bytes

    long lngVal = 548461654646585l; //Upto 19 digits, Size - 8bytes

    float fltVal = 56.245f;

    double dbleVal = 25.23547;

    char chrVal = 'A';

    String strVal = "Java is Portable"; // no defined size

    public static void main(String[] args) {
        DataType types = new DataType();

        byte temp = types.bytVal;
        System.out.println(temp);
        System.out.println(types.shrtVal);
        System.out.println(types.intVal);
        System.out.println(types.lngVal);
        System.out.println(types.fltVal);
        System.out.println(types.dbleVal);
        System.out.println(types.chrVal);
        System.out.println(types.strVal);

    }

}