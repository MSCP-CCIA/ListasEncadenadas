import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int n = leer.nextInt();
        Nodo[] array =new Nodo[n];
        array[0]=new Nodo();
        array[0].setDato(20);
        array[0].setSiguiente(null);
        mostrar(insertarAlInicio(array));

    }
    public static boolean listaVacia(Nodo[]array){
        if(array[0]==null){
            return true;
        }else {
            return false;
        }
    }

    public static <T> Nodo[] insertarAlInicio(Nodo[] array){
        Nodo nuevo =new Nodo();
        if(listaVacia(array)==true){
            array[0]= nuevo;
            array[0].setDato((int)(Math.random()*99+10));
            array[0].setSiguiente(null);
            return array;
        }
        else{
            Nodo[] arrayCopy =new Nodo[array.length+1];
            arrayCopy[0]=nuevo;
            arrayCopy[0].setSiguiente(array[0]);
            arrayCopy[0].setDato((int)(Math.random()*99+10));
            System.arraycopy(array,0,arrayCopy,1,array.length);
            return arrayCopy;
        }

    }
    public static Nodo[] insertarAlFinal(Nodo[]array,int iteradora){
        Nodo nuevo =new Nodo();
        if(array[iteradora].getSiguiente()==null){
                Nodo[] arrayCopy =new Nodo[array.length+1];
                System.arraycopy(array,0,arrayCopy,0,array.length);
                array[iteradora].setSiguiente(nuevo);
                arrayCopy[iteradora+1]=nuevo;
                arrayCopy[0].setSiguiente(null);
                arrayCopy[0].setDato((int)(Math.random()*99+10));
                return arrayCopy;

        }else{
            return insertarAlFinal(array,iteradora+1);
        }

    }
    public static void mostrar(Nodo[]array){
        for (Nodo nodo:array) {
            System.out.println(nodo.toString());
        }
    }
}

