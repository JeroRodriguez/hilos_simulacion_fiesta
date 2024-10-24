public class DecorarLugar extends TareaFiesta {
    public DecorarLugar() {
        super("Decorar el lugar");
    }

    @Override
    protected void ejecutarTarea() throws InterruptedException {
        System.out.println(nombreTarea + " está en progreso...");
        Thread.sleep(4000); // Simula que la tarea toma 4 segundos
        System.out.println(nombreTarea + " completada.");
    }
}
