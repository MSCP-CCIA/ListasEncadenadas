import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int n = leer.nextInt();
        Nodo[] array =new Nodo[n];
        System.out.println(insertarAlInicio(array).toString());

    }
    public static boolean listaVacia(Nodo[]array){
        if(array.length==0){
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
}
