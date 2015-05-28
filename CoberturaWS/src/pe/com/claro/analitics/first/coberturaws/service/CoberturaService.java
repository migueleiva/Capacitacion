package pe.com.claro.analitics.first.coberturaws.service;

import org.springframework.stereotype.Service;

import pe.com.claro.analitics.first.coberturaws.types.CoberturaRequest;


public interface CoberturaService {

	public abstract String validarCoordenadas(CoberturaRequest request);

}