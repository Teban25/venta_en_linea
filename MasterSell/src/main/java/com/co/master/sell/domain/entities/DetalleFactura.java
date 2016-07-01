package com.co.master.sell.domain.entities;
// Generated 1/07/2016 09:30:19 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * DetalleFactura generated by hbm2java
 */
public class DetalleFactura  implements java.io.Serializable {


     private DetalleFacturaId id;
     private Articulo articulo;
     private Factura factura;
     private int cantidad;
     private BigDecimal total;
     private Set<Devolucion> devolucions = new HashSet<Devolucion>(0);

    public DetalleFactura() {
    }

	
    public DetalleFactura(DetalleFacturaId id, Articulo articulo, Factura factura, int cantidad, BigDecimal total) {
        this.id = id;
        this.articulo = articulo;
        this.factura = factura;
        this.cantidad = cantidad;
        this.total = total;
    }
    public DetalleFactura(DetalleFacturaId id, Articulo articulo, Factura factura, int cantidad, BigDecimal total, Set<Devolucion> devolucions) {
       this.id = id;
       this.articulo = articulo;
       this.factura = factura;
       this.cantidad = cantidad;
       this.total = total;
       this.devolucions = devolucions;
    }
   
    public DetalleFacturaId getId() {
        return this.id;
    }
    
    public void setId(DetalleFacturaId id) {
        this.id = id;
    }
    public Articulo getArticulo() {
        return this.articulo;
    }
    
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public Set<Devolucion> getDevolucions() {
        return this.devolucions;
    }
    
    public void setDevolucions(Set<Devolucion> devolucions) {
        this.devolucions = devolucions;
    }




}


