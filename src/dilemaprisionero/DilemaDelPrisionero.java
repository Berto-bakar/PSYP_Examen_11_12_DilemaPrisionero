package dilemaprisionero;

public class DilemaDelPrisionero {

    public static void main(String[] args) throws InterruptedException {
        int numeroDePartidas = 5; // Número de partidas, se puede modificar.

        // Mostrar mensaje de inicio
        System.out.println("¡Comenzando el juego del Dilema del Prisionero!\n");

        // Ciclo para jugar varias partidas
        for (int i = 0; i < numeroDePartidas; i++) {
            System.out.println("\nPartida " + (i + 1) + ":");

            // Crear jugadores
            Thread colaborador = new Thread(new JugadorColaborador(1));
            Thread ratero = new Thread(new JugadorRatero(2));

            // Crear la partida
            Partida partida = new Partida(colaborador, ratero);
            partida.jugar();
        }

        // Mostrar mensaje de finalización
        System.out.println("\nJuego terminado. ¡Gracias por jugar!");
    }
}