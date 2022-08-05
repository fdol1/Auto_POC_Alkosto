package com.choucair.moviles.utils.enums;

public enum ConfiguracionInteracciones {
    CANTIDAD_INTERACCIONES(10);

    String opcionString;
    int opcionInt;

    private ConfiguracionInteracciones(int opcionInt) {
        this.opcionInt = opcionInt;
    }

    public String getOpcionString() {
        return this.opcionString;
    }

    public int getOpcionInt() {
        return this.opcionInt;
    }
}