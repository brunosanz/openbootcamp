public class Main {
    public static void main(String[] args) {

        // Usando un if
        int numeroIf = -1;

        if (numeroIf == 0)
            System.out.println("numeroIf es 0.");
        else if (numeroIf > 0) {
            System.out.println("numeroIf es positivo.");
        }else{
            System.out.println("numeroIf es negativo.");
        }

        // Crea un bucle While
        int numeroWhile = 0;

        while (numeroWhile < 3 ){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        // bucle Do While
        int numeroDoWhile = 3;

        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        }while(numeroDoWhile < 3);

        // bucle For

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // Switch

        var estacion = "PRIMAVERA";

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es primavera.");
                break;

            case "VERANO":
                System.out.println("Es verano.");
                break;

            case "OTOÑO":
                System.out.println("Es otoño.");
                break;

            case "INVIERNO":
                System.out.println("Es invierno.");
                break;

            default:
                System.out.println("No es una estación.");
        }

    }
}