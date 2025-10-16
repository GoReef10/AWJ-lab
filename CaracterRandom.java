public class CaracterRandom {

    /* Genereaza un caracter random intre ch1 si ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        if(ch1  < ch2) {
            return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
        }
        else return (char)(ch2 + Math.random() * (ch1 - ch2 + 1));
    }

    /* Genereaza random o litera mica */
    public static char getRandomLowerCaseLetter() {
        return (char)('a' + Math.random() * ('z' - 'a' + 1));
    }

    /* Genereaza random o litera mare */
    public static char getRandomUpperCaseLetter() {
        return (char)('A' + Math.random() * ('Z' - 'A' + 1));
    }

    /* Genereaza random o cifra */
    public static char getRandomDigitCharacter() {
        return (char)('0' + Math.random() * ('9' - '0' + 1));
    }

    /* Genereaza random un caracter */
    public static char getRandomCharacter() {
        return (char)(Math.random() * (65536));
    }

}
