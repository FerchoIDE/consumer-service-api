package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "avisos")
public class avisos {

	  String FechaFinAviso;
      String aviso;
      String FechaInicioAviso;
      boolean status;
	public String getFechaFinAviso() {
		return FechaFinAviso;
	}
	public void setFechaFinAviso(String fechaFinAviso) {
		FechaFinAviso = fechaFinAviso;
	}
	public String getAviso() {
		return aviso;
	}
	public void setAviso(String aviso) {
		this.aviso = aviso;
	}
	public String getFechaInicioAviso() {
		return FechaInicioAviso;
	}
	public void setFechaInicioAviso(String fechaInicioAviso) {
		FechaInicioAviso = fechaInicioAviso;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "avisos [FechaFinAviso=" + FechaFinAviso + ", aviso=" + aviso + ", FechaInicioAviso=" + FechaInicioAviso
				+ ", status=" + status + "]";
	}
      
}
