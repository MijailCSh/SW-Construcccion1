package com.mycompany.pregunta2;


public class Contrato {
    private final String codigo;
    private final String proveedor;
    private final double monto;
    private final int vigenciaDias;
    private final boolean clausulaPenalidad;
    private final String fechaFirma;
    private final String observaciones;
    
    private Contrato(Builder builder){
        this.codigo = builder.codigo;
        this.proveedor = builder.proveedor;
        this.monto = builder.monto;
        this.vigenciaDias = builder.vigenciaDias;
        this.clausulaPenalidad = builder.clausulaPenalidad;
        this.fechaFirma = builder.fechaFirma;
        this.observaciones = builder.observaciones;
    }
    
    public static Builder builder(){
        return new Builder();
    }
    
    public static class Builder{
        private String codigo;
        private String proveedor;
        private double monto;
        private int vigenciaDias;
        private boolean clausulaPenalidad;
        private String fechaFirma;
        private String observaciones;

        public Builder Codigo(String codigo){
            this.codigo = codigo;
            return this;
        }

        public Builder Proveedor(String proveedor){
            this.proveedor = proveedor;
            return this;
        }

        public Builder Monto(double monto){
            this.monto = monto;
            return this;
        }
        public Builder VigenciaDias(int vigenciaDias){
            this.vigenciaDias = vigenciaDias;
            return this;
        }

        public Builder ClausulaPenalidad(boolean clausulaPenalidad){
            this.clausulaPenalidad = clausulaPenalidad;
            return this;
        }
        
        public Builder FechaFirma(String fechaFirma){
            this.fechaFirma = fechaFirma;
            return this;
        }

        public Builder Observaciones(String observaciones){
            this.observaciones = observaciones;
            return this;
        }        
        
        public Contrato build(){
            if (codigo == null || codigo.isBlank()){
                throw new IllegalStateException("El código es obligatorio");
            }
            if (proveedor == null || proveedor.isBlank()){
                throw new IllegalStateException("El proveedor es obligatorio");
            }
            if (monto<=0){
                throw new IllegalStateException("EL monto tiene que ser mayor a 0");
            }
            
            return new Contrato(this);
        }
    }


    public String getCodigo() {
        return codigo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public double getMonto() {
        return monto;
    }

    public int getVigenciaDias() {
        return vigenciaDias;
    }

    public boolean isClausulaPenalidad() {
        return clausulaPenalidad;
    }
    
    public String getFechaFirma() {
        return fechaFirma;
    }

    public String getObservaciones() {
        return observaciones;
    }    
}
