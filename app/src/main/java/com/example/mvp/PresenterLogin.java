package com.example.mvp;

import org.jetbrains.annotations.NotNull;

public class PresenterLogin {

    private MainActivity mainActivity;

    public PresenterLogin( MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void validarLogin(String email, String senha){
        if(email.isEmpty() || senha.isEmpty()){
            mainActivity.usuarioembranco();
        }else{
            if(email.equals("Matheus") && senha.equals("12345")){
                mainActivity.autenticadocomsucesso();
            }else{
                mainActivity.autenticadocomfalha();
            }
        }
    }
}
