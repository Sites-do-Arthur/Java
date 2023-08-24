/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemcp.g.sql.java;

/**
 *
 * @author Win10
 */
public class SqlArquivos {
    public static String sqlAlunos(String pessoa) {
        String amandaDado = "<html>Cobra, toda disfarsada, mas por trassss...</html>";
        String viniDado = "<html>Melhor amigo do Arthur, um pouco doido mas divertido</html>";
        if ("Amanda".equals(pessoa)) {
            return amandaDado;
        } else {
            if ("Vinicius".equals(pessoa)) {
                return viniDado;
            } else {
                return null;
            }
        }
    }
}
