public class OrganizacionFiestaMain {
    public static void main(String[] args) {
        System.out.println("Comenzando la organización de la fiesta...");

        // Crear las tareas
        TareaFiesta prepararComida = new PrepararComida();
        TareaFiesta enviarInvitaciones = new EnviarInvitaciones();
        TareaFiesta decorarLugar = new DecorarLugar();

        // Crear hilos para cada tarea
        Thread hiloComida = new Thread(prepararComida);
        Thread hiloInvitaciones = new Thread(enviarInvitaciones);
        Thread hiloDecoracion = new Thread(decorarLugar);

        // Iniciar las tareas simultáneamente
        hiloComida.start();
        hiloInvitaciones.start();
        hiloDecoracion.start();

        try {
            // Esperar a que todas las tareas terminen
            hiloComida.join();
            hiloInvitaciones.join();
            hiloDecoracion.join();
        } catch (InterruptedException e) {
            System.out.println("La organización fue interrumpida.");
        }

        System.out.println("¡La organización de la fiesta ha terminado!");
    }
}
