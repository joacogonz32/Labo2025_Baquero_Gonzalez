package Colores;

public enum Color {
    ROJO("#FF0000"),AZUL("#0000FF"), VERDE("#008000"),
    AMARILLO("#FFFF00"), NARANJA("#FFA500"), ROSADO("#FFC0CB"),
    MORADO("#800080"), CELESTE("#00CED1"), MARRON("#A52A2A"),
    GRIS("#808080"), NEGRO("#000000"), BLANCO("#FFFFFF"),
    TURQUESA("#40E0D0"), DORADO("#FFD700"), PLATEADO("#C0C0C0");

    private String codigoColor;

    private Color (String codigoColor){
        this.codigoColor = codigoColor;
    }

    public String getCodigoColor() {
        return codigoColor;
    }
    public void setCodigoColor(String codigoColor) {
        this.codigoColor = codigoColor;
    }

    public static void main(String[] args) {
        Color rojo = Color.ROJO;
    }

}
