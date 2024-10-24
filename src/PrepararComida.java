public class PrepararComida extends TareaFiesta {
    public PrepararComida() {
        super("Preparar la comida");
    }

    @Override
    protected void ejecutarTarea() throws InterruptedException {
        System.out.println(nombreTarea + " está en progreso...");
        Thread.sleep(3000); // Simula que la tarea toma 3 segundos
        System.out.println(nombreTarea + " completada.");
    }
}
