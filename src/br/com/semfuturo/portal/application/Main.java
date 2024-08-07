package br.com.semfuturo.portal.application;

import br.com.semfuturo.portal.login.Login;

public class Main {

    public static void main(String[] args) {
        System.out.println(Login.autenticacao("admin","admin123"));
    }

}
