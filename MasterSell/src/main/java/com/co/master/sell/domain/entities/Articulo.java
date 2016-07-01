package com.co.master.sell.domain.entities;
// Generated 1/07/2016 09:30:19 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Articulo generated by hbm2java
 */
public class Articulo  implements java.io.Serializable {


     private int idArticulo;
     private Provedor provedor;
     private TipoArticulo tipoArticulo;
     private String descripcion;
     private BigDecimal precioVenta;
     private BigDecimal precioCosto;
     private int stock;
     private Date fechaRegistro;
     private Set<DetalleFactura> detalleFacturas = new HashSet<DetalleFactura>(0);

    public Articulo() {
    }

	
    public Articulo(int idArticulo, Provedor provedor, TipoArticulo tipoArticulo, String descripcion, BigDecimal precioVenta, BigDecimal precioCosto, int stock, Date fechaRegistro) {
        this.idArticulo = idArticulo;
        this.provedor = provedor;
        this.tipoArticulo = tipoArticulo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
        this.stock = stock;
        this.fechaRegistro = fechaRegistro;
    }
    public Articulo(int idArticulo, Provedor provedor, TipoArticulo tipoArticulo, String descripcion, BigDecimal precioVenta, BigDecimal precioCosto, int stock, Date fechaRegistro, Set<DetalleFactura> detalleFacturas) {
       this.idArticulo = idArticulo;
       this.provedor = provedor;
       this.tipoArticulo = tipoArticulo;
       this.descripcion = descripcion;
       this.precioVenta = precioVenta;
       this.precioCosto = precioCosto;
       this.stock = stock;
       this.fechaRegistro = fechaRegistro;
       this.detalleFacturas = detalleFacturas;
    }
   
    public int getIdArticulo() {
        return this.idArticulo;
    }
    
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }
    public Provedor getProvedor() {
        return this.provedor;
    }
    
    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }
    public TipoArticulo getTipoArticulo() {
        return this.tipoArticulo;
    }
    
    public void setTipoArticulo(TipoArticulo tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
    public BigDecimal getPrecioCosto() {
        return this.precioCosto;
    }
    
    public void setPrecioCosto(BigDecimal precioCosto) {
        this.precioCosto = precioCosto;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Set<DetalleFactura> getDetalleFacturas() {
        return this.detalleFacturas;
    }
    
    public void setDetalleFacturas(Set<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }




}

