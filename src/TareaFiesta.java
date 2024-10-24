public abstract class TareaFiesta implements Runnable {
    protected String nombreTarea;

    public TareaFiesta(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    @Override
    public void run() {
        try {
            ejecutarTarea();
        } catch (InterruptedException e) {
            System.out.println(nombreTarea + " fue interrumpida.");
        }
    }

    protected abstract void ejecutarTarea() throws InterruptedException;
}
