public class PosNeg {
    boolean posNeg(int a, int b, boolean negativ) {
        boolean val = false;
        if(negativ) {
            if((a * b) < 0) {
                // una e pozitiva, alta e negativa
                val = false;
            }
            else {
                // ambele pozitive ori negative
                if(a < 0) {
                    // ambele numere sunt negative
                    val = true;
                }
                else {
                    val = false;
                }
            }
        }
        else {
            val = ((a * b) < 0);
        }
        return val;
    }
}
