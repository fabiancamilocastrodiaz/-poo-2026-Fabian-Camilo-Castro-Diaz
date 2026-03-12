# Clase base
class Animal:
    def sonido(self):
        print("El animal hace un sonido")


# Clase Perro
class Perro(Animal):

    def __init__(self, nombre, raza, edad):
        self.nombre = nombre
        self.raza = raza
        self.edad = edad

    def sonido(self):
        print("El perro ladra")

    def correr(self):
        print("El perro está corriendo")


# Clase Vaca
class Vaca(Animal):

    def __init__(self, nombre, peso, color):
        self.nombre = nombre
        self.peso = peso
        self.color = color

    def sonido(self):
        print("La vaca muge")

    def comer(self):
        print("La vaca está comiendo pasto")


# Clase Pajaro
class Pajaro(Animal):

    def __init__(self, especie, color, puede_volar):
        self.especie = especie
        self.color = color
        self.puede_volar = puede_volar

    def sonido(self):
        print("El pájaro canta")

    def volar(self):
        print("El pájaro está volando")

