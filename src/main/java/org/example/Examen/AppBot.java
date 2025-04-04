package org.example.Examen;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class AppBot {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String,String> bot = new HashMap<>();

        bot.put("hola","Hola, ¿En que te puedo ayudar?");
        bot.put("¿como estas?","!Estoy listo de ayudarte¡");
        bot.put("adios","¡Hasta luego!");
        bot.put("salir","¡Adios!");
        bot.put("gracias","¡De nada! Que tengas un buen dia");
        String chat = "Chatbot: ";
        String tu = "Tu:";

        System.out.println(chat + "Bienvenido! Escribe <salir> cuando quieras acabar la conversacion...");
        System.out.print(tu);
        String valor = entrada.nextLine();
        String chate = "";
        while(!Objects.equals(valor, "salir")) {
            for (Map.Entry<String, String> clave : bot.entrySet()) {
                if (clave.getKey().equals(valor.toLowerCase()))
                {
                    chate = clave.getValue();
                }
            }
            if (chate != "")
            {
                System.out.println(chat + " " + chate);
                chate = "";
                System.out.print(tu);
                valor = entrada.nextLine();
            }else{
                System.out.println(chat + " No te entiendo :(");
                System.out.print(tu);
                valor = entrada.nextLine();
            }

        }
        System.out.println(chat + "¡Adios!");
    }

}
