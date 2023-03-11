
public class Torre {
    public static void main(String[] args) {
        int disco = 5;
        hanoi(disco, 'A', 'B', 'C');
    }

    private static void hanoi(int disco, char inicio, char auxiliar, char destino) {
        if (disco > 0){
            hanoi(disco-1, inicio, destino, auxiliar); //inicio para o auxiliar (n-1)
            System.out.print(disco); //mostra o numero do disco.
            System.out.printf(" Mover de %s para %s\n", inicio, destino); //movimento do inicio para o destino
            hanoi(disco-1, auxiliar, inicio, destino);  //auxiliar para o destino (n-1)

        }

    }
}
