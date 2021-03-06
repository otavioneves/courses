package com.otavio.curso.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.otavio.curso.demo.dao.DepartamentoDao;
import com.otavio.curso.demo.domain.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	DepartamentoDao departamentoDao;
	
	@Transactional(readOnly=false)
	@Override
	public void salvar(Departamento departamento) {
		departamentoDao.save(departamento);
	}

	@Transactional(readOnly=false)
	@Override
	public void editar(Departamento departamento) {
		departamentoDao.update(departamento);
	}

	@Transactional(readOnly=false)
	@Override
	public void excluir(Long id) {
		departamentoDao.delete(id);
	}

	@Transactional(readOnly=true)
	@Override
	public Departamento buscarPorId(Long id) {
		
		return departamentoDao.findById(id);
	}

	@Transactional(readOnly=true)
	@Override
	public List<Departamento> buscarTodos() {
		
		return departamentoDao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if (buscarPorId(id).getCargos().isEmpty()) {
			return false;
		}
		
		return true;
	}

	
	
}
