//1.Leer un número entero y determinar si es un número terminado en 4.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            int ultimoDigito = Math.abs(num % 10);
            if (ultimoDigito == 4) {
                System.out.println("El número SÍ termina en 4.");
            } else {
                System.out.println("El número NO termina en 4.");
            }
        } else {
            System.out.println("Error: Por favor, ingrese un número entero válido.");
        }
        sc.close();
    }
}
// 2. Leer un número entero y determinar si tiene 3 dígitos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        if (absNum >= 100 && absNum <= 999) {
            System.out.println("El número SÍ tiene 3 dígitos.");
        } else {
            System.out.println("El número NO tiene 3 dígitos.");
        }
    }
}
// 3. Leer un número entero y determinar si es negativo.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("El número SÍ es negativo.");
        } else {
            System.out.println("El número NO es negativo (es cero o positivo).");
        }
    }
}
//4. Leer un número entero de dos dígitos y determinar a cuánto es igual la suma de sus dígitos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos (ej. 45): ");
        int num = sc.nextInt();
        int digito1 = num / 10;
        int digito2 = num % 10;
        int suma = digito1 + digito2;
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
//5. Leer un número entero de dos dígitos y determinar si ambos dígitos son pares.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos (ej. 48): ");
        int num = sc.nextInt();
        int digito1 = num / 10;
        int digito2 = num % 10;
        boolean esPar1 = (digito1 % 2 == 0);
        boolean esPar2 = (digito2 % 2 == 0);
        if (esPar1 && esPar2) {
            System.out.println("Ambos dígitos son pares.");
        } else {
            System.out.println("Al menos uno de los dígitos no es par.");
        }
    }
}
//6. Leer un número entero de dos dígitos menor que 20 y determinar si es primo.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos menor que 20 (10-19): ");
        int num = sc.nextInt();
        boolean esPrimo = false;
        if (num == 11 || num == 13 || num == 17 || num == 19) {
            esPrimo = true;
        }
        if (esPrimo) {
            System.out.println("El número " + num + " SÍ es primo.");
        } else {
            System.out.println("El número " + num + " NO es primo.");
        }
    }
}
// 7. Leer un número entero de dos dígitos y determinar si es primo y además si es negativo. 8. Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos.

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos (ej. -17): ");
        int num = sc.nextInt();
        boolean esNegativo = num < 0;
        int absNum = Math.abs(num);
        boolean esAbsPrimo = esPrimo(absNum);
        if (esAbsPrimo && esNegativo) {
            System.out.println("El número SÍ es primo (en valor absoluto) Y es negativo.");
        } else {
            System.out.println("El número NO cumple ambas condiciones.");
        }
    }
}
//8. Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro.

    public static boolean esDigitoPrimo(int d) {
        return d == 2 || d == 3 || d == 5 || d == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos (ej. 23): ");
        int num = sc.nextInt();
        int digito1 = Math.abs(num) / 10;
        int digito2 = Math.abs(num) % 10;
        boolean primo1 = esDigitoPrimo(digito1);
        boolean primo2 = esDigitoPrimo(digito2);
        if (primo1 && primo2) {
            System.out.println("Ambos dígitos son primos.");
        } else {
            System.out.println("Al menos uno de los dígitos NO es primo.");
        }
    }
}
//9. Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos (ej. 63): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 10;
        int d2 = absNum % 10;

        boolean esMultiplo = false;
        if (d1 != 0 && d2 % d1 == 0) {
            esMultiplo = true;
        }
        if (d2 != 0 && d1 % d2 == 0) {
            esMultiplo = true;
        }

        if (esMultiplo) {
            System.out.println("Uno de los dígitos es múltiplo del otro.");
        } else {
            System.out.println("Ningún dígito es múltiplo del otro.");
        }
    }
}
//10. Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de dos dígitos (ej. 44): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);

        int d1 = absNum / 10;
        int d2 = absNum % 10;

        if (d1 == d2) {
            System.out.println("Los dos dígitos son iguales.");
        } else {
            System.out.println("Los dos dígitos NO son iguales.");
        }
    }
}
//11. Leer dos números enteros y determinar cuál es el mayor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
//12. Leer dos números enteros de dos dígitos y determinar si tienen dígitos comunes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número de dos dígitos (ej. 14): ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número de dos dígitos (ej. 48): ");
        int num2 = sc.nextInt();
        int d1_1 = Math.abs(num1) / 10;
        int d1_2 = Math.abs(num1) % 10;
        int d2_1 = Math.abs(num2) / 10;
        int d2_2 = Math.abs(num2) % 10;
        boolean tienenComunes = false;
        if (d1_1 == d2_1 || d1_1 == d2_2 || d1_2 == d2_1 || d1_2 == d2_2) {
            tienenComunes = true;
        }
        if (tienenComunes) {
            System.out.println("Los números SÍ tienen dígitos comunes.");
        } else {
            System.out.println("Los números NO tienen dígitos comunes.");
        }
    }
}
//13. Leer dos números enteros de dos dígitos y determinar si la suma de los dos números origina un número par.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número de dos dígitos: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número de dos dígitos: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;

        if (suma % 2 == 0) {
            System.out.println("La suma de los números (" + suma + ") es un número par.");
        } else {
            System.out.println("La suma de los números (" + suma + ") es un número impar.");
        }
    }
}
//14. Leer dos números enteros de dos dígitos y determinar a cuánto es igual la suma de todos los dígitos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número de dos dígitos (ej. 14): ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número de dos dígitos (ej. 23): ");
        int num2 = sc.nextInt();
        int d1_1 = Math.abs(num1) / 10;
        int d1_2 = Math.abs(num1) % 10;
        int d2_1 = Math.abs(num2) / 10;
        int d2_2 = Math.abs(num2) % 10;
        int sumaTotal = d1_1 + d1_2 + d2_1 + d2_2;
        System.out.println("La suma de todos los dígitos es: " + sumaTotal);
    }
}
//15. Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus dígitos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 123): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;
        int suma = d1 + d2 + d3;
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
//16. Leer un número entero de tres dígitos y determinar si al menos dos de sus tres dígitos son iguales.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 121): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;
        if (d1 == d2 || d1 == d3 || d2 == d3) {
            System.out.println("Al menos dos de los dígitos son iguales.");
        } else {
            System.out.println("Todos los dígitos son diferentes.");
        }
    }
}
//17. Leer un número entero de tres dígitos y determinar en qué posición está el mayor dígito.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 825): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;
        String posicion;
        if (d1 >= d2 && d1 >= d3) {
            posicion = "1 (Centena)";
        } else if (d2 >= d3) {
            posicion = "2 (Decena)";
        } else {
            posicion = "3 (Unidad)";
        }
        System.out.println("El mayor dígito está en la posición: " + posicion);
    }
}
//18. Leer un número entero de tres dígitos y determinar si algún dígito es múltiplo de los otros.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 623): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;
        boolean esMultiplo = false;
        if ((d2 != 0 && d1 % d2 == 0) || (d3 != 0 && d1 % d3 == 0)) esMultiplo = true;
        if ((d1 != 0 && d2 % d1 == 0) || (d3 != 0 && d2 % d3 == 0)) esMultiplo = true;
        if ((d1 != 0 && d3 % d1 == 0) || (d2 != 0 && d3 % d2 == 0)) esMultiplo = true;
        if (esMultiplo) {
            System.out.println("Algún dígito es múltiplo de otro dígito.");
        } else {
            System.out.println("Ningún dígito es múltiplo de otro dígito.");
        }
    }
}
//19. Leer tres números enteros y determinar cuál es el mayor. Usar solamente dos variables.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int mayor = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num = sc.nextInt();
        if (num > mayor) {
            mayor = num;
        }
        System.out.print("Ingrese el tercer número: ");
        num = sc.nextInt();
        if (num > mayor) {
            mayor = num;
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
//20. Leer tres números enteros y mostrarlos ascendentemente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();

        int[] numeros = {a, b, c};
        Arrays.sort(numeros);
        System.out.println("Los números ordenados ascendentemente son: "
                + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
//21. Leer tres números enteros de dos dígitos cada uno y determinar en cuál de ellos se encuentra el mayor dígito.

    public static int getMayorDigito(int num) {
        int d1 = Math.abs(num) / 10;
        int d2 = Math.abs(num) % 10;
        return Math.max(d1, d2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número de dos dígitos (num1): ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número de dos dígitos (num2): ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese el tercer número de dos dígitos (num3): ");
        int num3 = sc.nextInt();

        int maxDigito1 = getMayorDigito(num1);
        int maxDigito2 = getMayorDigito(num2);
        int maxDigito3 = getMayorDigito(num3);
        int mayorDeTodos = Math.max(maxDigito1, Math.max(maxDigito2, maxDigito3));
        System.out.print("El mayor dígito (" + mayorDeTodos + ") se encuentra en el número(s): ");
        if (maxDigito1 == mayorDeTodos) System.out.print("num1 (" + num1 + ") ");
        if (maxDigito2 == mayorDeTodos) System.out.print("num2 (" + num2 + ") ");
        if (maxDigito3 == mayorDeTodos) System.out.print("num3 (" + num3 + ") ");
        System.out.println();
    }
}
//22. Leer un número entero de tres dígitos y determinar si el primer dígito es igual al último.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 343): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int primerDigito = absNum / 100;
        int ultimoDigito = absNum % 10;
        if (primerDigito == ultimoDigito) {
            System.out.println("El primer y el último dígito SÍ son iguales.");
        } else {
            System.out.println("El primer y el último dígito NO son iguales.");
        }
    }
}
//23. Leer un número entero de tres dígitos y determinar cuántos dígitos primos tiene.

    public static boolean esDigitoPrimo(int d) {
        return d == 2 || d == 3 || d == 5 || d == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 234): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;
        int contadorPrimos = 0;
        if (esDigitoPrimo(d1)) contadorPrimos++;
        if (esDigitoPrimo(d2)) contadorPrimos++;
        if (esDigitoPrimo(d3)) contadorPrimos++;
        System.out.println("El número tiene " + contadorPrimos + " dígitos primos.");
    }
}
//24. Leer un número entero de tres dígitos y determinar cuántos dígitos pares tiene.

    public static boolean esDigitoPar(int d) {
        return d % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 245): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;
        int contadorPares = 0;
        if (esDigitoPar(d1)) contadorPares++;
        if (esDigitoPar(d2)) contadorPares++;
        if (esDigitoPar(d3)) contadorPares++;
        System.out.println("El número tiene " + contadorPares + " dígitos pares.");
    }
}
//25. Leer un número entero de tres dígitos y determinar si alguno de sus dígitos es igual a la suma de los otros dos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero de tres dígitos (ej. 123): ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        int d1 = absNum / 100;
        int d2 = (absNum / 10) % 10;
        int d3 = absNum % 10;

        if (d1 == d2 + d3 || d2 == d1 + d3 || d3 == d1 + d2) {
            System.out.println("SÍ, alguno de los dígitos es igual a la suma de los otros dos.");
        } else {
            System.out.println("NO, ninguno de los dígitos es igual a la suma de los otros dos.");
        }
    }
}

