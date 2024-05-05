import java.util.Scanner;

public class BibliotecaVirtual {
    private static GestorUsuarios gestorUsuarios = new GestorUsuarios();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Bienvenido al Sistema de Biblioteca Virtual");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    registrarse();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void iniciarSesion() {
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = scanner.next();
        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.next();
        Usuario usuario = gestorUsuarios.iniciarSesion(nombreUsuario, contraseña);
        if (usuario != null) {
            menuUsuario(usuario);
        } else {
            System.out.println("Credenciales incorrectas. Intente de nuevo.");
        }
    }

    private static void registrarse() {
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = scanner.next();
        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.next();
        System.out.println("Tipo de usuario (1. Estudiante, 2. Profesor, 3. Administrador): ");
        int tipoUsuario = scanner.nextInt();
        Usuario usuario = gestorUsuarios.crearUsuario(nombreUsuario, contraseña, TipoUsuario.values()[tipoUsuario - 1]);
        if (usuario != null) {
            System.out.println("Usuario registrado con éxito.");
            menuUsuario(usuario);
        } else {
            System.out.println("Error al registrar usuario.");
        }
    }

    private static void menuUsuario(Usuario usuario) {
        usuario.mostrarMenu();
    }
}
