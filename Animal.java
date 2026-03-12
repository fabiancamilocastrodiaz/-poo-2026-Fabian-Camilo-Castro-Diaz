// Clase base
class Animal {
    String nombre;
    int edad;
    String color;

    void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase Perro
class Perro extends Animal {
    String raza;
    int velocidad;
    boolean domestico;

    void sonido() {
        System.out.println("El perro ladra");
    }

    void correr() {
        System.out.println("El perro está corriendo");
    }
}

// Clase Vaca
class Vaca extends Animal {
    int peso;
    String tipoLeche;
    boolean tieneCuernos;

    void sonido() {
        System.out.println("La vaca muge");
    }

    void comer() {
        System.out.println("La vaca está comiendo pasto");
    }
}

// Clase Pajaro
class Pajaro extends Animal {
    String especie;
    double envergaduraAlas;
    boolean puedeVolar;

    void sonido() {
        System.out.println("El pájaro canta");
    }

    void volar() {
        System.out.println("El pájaro está volando");
    }
}
