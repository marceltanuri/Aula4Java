package br.com.semfuturo.portal.login;

import br.com.semfuturo.portal.constants.Constants;

public class Login {

    public static String autenticacao(String usuario, String senha){

        if(usuario.equals(MockDataBase.adminUserName)){
            if(senha.equals(MockDataBase.adminPassword)){
                return "sucesso";
            }
        }

        return Constants.MENSAGEM_LOGIN_INVALIDO;
    }

}
