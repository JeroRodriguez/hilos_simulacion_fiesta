public class EnviarInvitaciones extends TareaFiesta {
    public EnviarInvitaciones() {
        super("Enviar las invitaciones");
    }

    @Override
    protected void ejecutarTarea() throws InterruptedException {
        System.out.println(nombreTarea + " está en progreso...");
        Thread.sleep(2000); // Simula que la tarea toma 2 segundos
        System.out.println(nombreTarea + " completada.");
    }
}
